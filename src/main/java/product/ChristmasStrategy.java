package product;

public class ChristmasStrategy implements ProductServiceInt {
    @Override
    public void discount(Product product) {
        product.setDiscount(0.15);
    }
}
