package product;

public class ProductService {
    public static void christmasDiscount(Product product){
        product.setDiscount( 0.15 * product.getCost());
    }

    public static void easterDiscount(Product product){
        product.setDiscount(0.10* product.getCost());
    }

    public static void newYearDiscount(Product product){
        product.setDiscount(0.2 * product.getCost());
    }

}
