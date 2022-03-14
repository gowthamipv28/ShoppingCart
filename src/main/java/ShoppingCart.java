import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    public List<Products> shopppingList;
    double totalAmount=0.00;

    public List<Products> getShopppingList() {
        return shopppingList;
    }

    public ShoppingCart() {
        shopppingList= new ArrayList<>();
    }

    public void addProduct(Products product){
        shopppingList.add(product);
    }

    public void removeProduct(Products product){
        shopppingList.remove(product);
    }

    public double subTotal(Products product){
        totalAmount= product.getQuantity()* product.getProductAmount();
        return totalAmount;
    }

    public double total(){
        double total=0.00;
        for (Products products : getShopppingList()) {
            total= total+subTotal(products);
        }
        return total;

    }
}
