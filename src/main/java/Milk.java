public class Milk implements Products {
    int quantity;
    double productAmount;
    private String name;

    public Milk(int quantity, double productAmount, String name) {
        this.quantity = quantity;
        this.productAmount = productAmount;
        this.name = name;
    }

    @Override
    public int getQuantity(){

        return quantity;
    }

    @Override
    public double getProductAmount(){
        return productAmount;
    }

    @Override
    public String getName() {
        return name;
    }
}
