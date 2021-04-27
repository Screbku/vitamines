import Entities.*;
import java.util.*;

public interface IData {
    List<Dishes> getAllDishes();
    List<DishProducts> getAllDishProducts();
    List<Products> getAllProducts();
    List<Vitamins> getAllVitamins();
    List<ProductVitamins> getAllProductVitamins();
    List<Allergens> getAllAllergens();
    List<Compatibility> getAllCompatibility();
    List<Features> getAllFeatures();
    List<Dosage> getAllDosage();
    List<ProductAllergens> getAllProductAllergens();
}