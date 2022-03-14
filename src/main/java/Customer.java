
public class Customer {
    public eWallet wallet;
    public ShoppingCart cart;

    public Customer(eWallet wallet) {
        this.wallet = wallet;
        cart= new ShoppingCart();
    }

    public void addToCart(Products products ){
        cart.addProduct(products);
    }

    public void removeToCart(Products products)
    {
        cart.removeProduct(products);
    }

    public void getWalletAmount(){
        wallet.getBalance();
    }

    public void addMoneyToWallet(double amount){
        wallet.addBalance(amount);
    }

}
