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
    List<Dosage> getAllDosage();
    List<Features> getAllFeatures();
    List<ProductAllergens> getAllProductAllergens();
}