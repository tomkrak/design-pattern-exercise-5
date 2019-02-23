package product;

public class EasterStrategy implements ProductServiceInt {
    @Override
    public void discount(Product product) {
        product.setDiscount(0.10);
    }
}
