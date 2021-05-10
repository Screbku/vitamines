import Entities.*;

import java.io.*;
import java.util.*;

public class Data implements IData {
    private List<Dishes> dishesList;
    private List<DishProducts> dishProductsList;
    private List<Products> productsList;
    private List<Vitamins> vitaminsList;
    private List<ProductVitamins> productVitaminsList;
    private List<Allergens> allergensList;
    private List<Compatibility> compatibilityList;
    private List<Dosage> dosageList;
    private List<Features> featuresList;
    private List<ProductAllergens> productAllergensList;
    public Data()   {
        try {
            loadVitamins();
            loadDishes();
            loadProducts();
            loadCompatibility();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void loadVitamins() throws FileNotFoundException {
        FileInputStream fVitamins = new FileInputStream("DAL/TestVitamins.txt");
        vitaminsList = new LinkedList<>();
        Scanner sc = new Scanner(fVitamins);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String [] newVitamin = line.split("/");
            String nameVitamin = newVitamin[1];
            String idVitamin = newVitamin[0];
            Vitamins vitamins = new Vitamins(idVitamin,nameVitamin);
            vitaminsList.add(vitamins);
        }

    }

    private void loadDishes() throws FileNotFoundException {
        FileInputStream fVitamins = new FileInputStream("DAL/TestDishes.txt");
        dishesList = new LinkedList<>();
        Scanner sc = new Scanner(fVitamins);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String [] newDish = line.split("/");
            String idDish = newDish[0];
            String nameDish = newDish[1];
            String link = newDish[2];
            Dishes vitamins = new Dishes(idDish,nameDish,link);
            dishesList.add(vitamins);
        }
    }

    private void loadProducts() throws FileNotFoundException {
        FileInputStream fVitamins = new FileInputStream("DAL/TestProducts.txt");
        productsList = new LinkedList<>();
        Scanner sc = new Scanner(fVitamins);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String [] newProduct = line.split("/");
            String idProduct = newProduct[0];
            String nameProduct = newProduct[1];
            String allergenProduct = newProduct[2];
            Products product = new Products(idProduct,nameProduct,allergenProduct);
            productsList.add(product);
        }
    }

    private void loadCompatibility() throws FileNotFoundException {
        FileInputStream fVitamins = new FileInputStream("DAL/TestCompatibility.txt");
        compatibilityList = new LinkedList<>();
        Scanner sc = new Scanner(fVitamins);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String [] newCompatibility = line.split("/");
            String idVit1 = newCompatibility[0];
            String idVit2 = newCompatibility[1];
            boolean type = newCompatibility[2].equals("true");
            Compatibility comp = new Compatibility(idVit1,idVit2,type);
            compatibilityList.add(comp);
        }
    }
    @Override
    public List<Dishes> getAllDishes() {
        return dishesList;
    }

    @Override
    public List<DishProducts> getAllDishProducts() {
        return dishProductsList;
    }

    @Override
    public List<Products> getAllProducts() {
        return productsList;
    }

    @Override
    public List<Vitamins> getAllVitamins() {
        return vitaminsList;
    }

    @Override
    public List<ProductVitamins> getAllProductVitamins() {
        return productVitaminsList;
    }

    @Override
    public List<Allergens> getAllAllergens() {
        return allergensList;
    }

    @Override
    public List<Compatibility> getAllCompatibility() {
        return compatibilityList;
    }

    @Override
    public List<Dosage> getAllDosage() {
        return dosageList;
    }

    @Override
    public List<Features> getAllFeatures() {
        return featuresList;
    }

    @Override
    public List<ProductAllergens> getAllProductAllergens() {
        return productAllergensList;
    }
}
