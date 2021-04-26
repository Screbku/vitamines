import Entities.*;

import java.io.*;
import java.util.*;

public class Data implements IData {
    private List<Dishes> dishesList;
    private List<DishProducts> dishProductsList;
    private List<Products> productsList;
    private List<Vitamins> vitaminsList;
    private List<ProductVitamins> productVitaminsList;
    public Data()   {
        try {
            loadVitamins();
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
    @Override
    public List<Dishes> getAllDishes() {
        return null;
    }

    @Override
    public List<DishProducts> getAllDishProduct() {
        return null;
    }

    @Override
    public List<Products> getAllProducts() {
        return null;
    }

    @Override
    public List<Vitamins> getAllVitamins() {
        return vitaminsList;
    }

    @Override
    public List<ProductVitamins> getAllProductVitamins() {
        return null;
    }
}
