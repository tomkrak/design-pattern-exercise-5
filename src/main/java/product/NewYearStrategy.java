package product;

public class NewYearStrategy implements ProductServiceInt {
    @Override
    public void discount(Product product) {
        product.setDiscount(0.20);
    }
}
