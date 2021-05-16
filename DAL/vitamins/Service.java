import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Service {
    private String current_vit = "A";
    //private Map<String, Integer> rateddish;
    private Map<String, String> links;
    
    private Map<String, ArrayList<Product>> dishprod;
    private Map<String, Vitamin> prodvit;

    public Service() throws IOException {
        load();
        //start();
    }
    
    Map<String, Integer> start(String current_vit) throws IOException {
    	this.current_vit = current_vit;
    	Map<String, Integer> VIT_COMPABILITY = load_compability();
    	Map<String, Integer> prodrating = compute_prodrating(prodvit, VIT_COMPABILITY);
        Map<String, Integer> dishrating = compute_dishrating(dishprod, prodrating);
        Map<String, Integer> rateddish = sortByValue(dishrating);
        return rateddish;
    }
    
    private void load() throws IOException {
    	dishprod = load_dishprod();
    	prodvit = load_prodvit();
    	links = load_links();
    }
    
    public String print(Map<String, Integer> rateddish){
    	String r = "";
        int count_dishes = 0;
        r+=" ~ Dish for day with "+current_vit+" vitamine ~ "+"\r\n";
        for(Map.Entry<String, Integer> e : rateddish.entrySet()) {
            if(e.getValue()>=0) {
                count_dishes++;
                r+=e.getKey() + " ~ " + links.get(e.getKey()) + " ~"+e.getValue()+"\r\n";
            }
            if(count_dishes==10||e.getValue()<0) {
                break;
            }
        }
        return r;
    }

    private Map<String, String> load_links() throws IOException {
        Map<String, String> res = new HashMap<>();
        // new BufferedReader(new InputStreamReader(new FileInputStream( "" ), "encoding"));
        //BufferedReader br = new BufferedReader(new FileReader(new File("DAL/links.csv")));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("DAL/links.csv")), "UTF-8"));

        String line = br.readLine();

        while((line = br.readLine())!=null) {
            String[] tmp = line.split(",");
            res.put(tmp[0], tmp[1]);
        }
        br.close();
        return res;
    }

    private Map<String, Integer> compute_dishrating(Map<String, ArrayList<Product>> dishprod,Map<String, Integer> prodrating) {
        Map<String, Integer> res = new HashMap<>();

        for(Map.Entry<String, ArrayList<Product>> e : dishprod.entrySet()) {
            int rating = 0;
            
            for(Product p : e.getValue()) {
            	
                rating += p.getWeight() * prodrating.get(p.getName());
            }

            res.put(e.getKey(), rating);
        }

        return res;
    }

    private Map<String, ArrayList<Product>> load_dishprod() throws IOException {
        Map<String, ArrayList<Product>> res = new HashMap<>();

        //BufferedReader br = new BufferedReader(new FileReader(new File("DAL/dishprod.csv")));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("DAL/dishprod.csv")), "UTF-8"));

        String line = br.readLine();

        while((line = br.readLine())!=null) {
            String[] tmp = line.split(",");
            int n = (tmp.length - 1) / 2;
            ArrayList<Product> a = new ArrayList<>();

            for(int i = 0; i<n;i++) {
                a.add(new Product(tmp[2*i+1],Integer.parseInt(tmp[2*i+2])));
            }

            res.put(tmp[0], a);
        }
        br.close();
        return res;
    }

    private Map<String, Integer> compute_prodrating(Map<String, Vitamin> s, Map<String, Integer> v) {
        Map<String, Integer> res = new HashMap<>();

        for(Map.Entry<String, Vitamin> e : s.entrySet()) {
            int rating = e.getValue().getWeight() * v.get(e.getValue().getName());

            res.put(e.getKey(), rating);
        }

        return res;
    }

    private Map<String, Vitamin> load_prodvit() throws IOException {
        Map<String, Vitamin> res = new HashMap<>();

        //BufferedReader br = new BufferedReader(new FileReader(new File("DAL/prodvit.csv")));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("DAL/prodvit.csv")), "UTF-8"));

        String line = br.readLine();

        while((line = br.readLine())!=null) {
            String[] tmp = line.split(",");
            res.put(tmp[0], new Vitamin(tmp[1], Integer.parseInt(tmp[2])));
        }
        br.close();
        return res;
    }

    private Map<String, Integer> load_compability() throws IOException{
        Map<String, Integer> k = new HashMap<>();
        
        
        //BufferedReader br = new BufferedReader(new FileReader(new File("DAL/comp.csv")));
        //BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("DAL/comp.csv")), "UTF-8"));
        
        FileInputStream fis = new FileInputStream("DAL/comp.csv");
        Scanner br = new Scanner(fis);
        
        String line = br.nextLine();
        line = br.nextLine();
        String[] vits = line.split(",");

        int pos = 0;

        while((line = br.nextLine())!=null) {
        	
            if(vits[pos].equals(current_vit)) {
                String[] tmp = line.split(",");
                for(int i = 0; i<tmp.length; i++) {
                    k.put(vits[i], Integer.parseInt(tmp[i]));
                }
                break;
            }
            pos++;
        }
        br.close();
        return k;
    }

    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map ) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2){
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

}


