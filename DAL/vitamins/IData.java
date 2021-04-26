import Entities.*;
import java.util.*;

public interface IData {
    List<Dishes> getAllDishes();
    List<DishProducts> getAllDishProduct();
    List<Products> getAllProducts();
    List<Vitamins> getAllVitamins();
    List<ProductVitamins> getAllProductVitamins();

}