public class eWallet {
    public double balance;

    public eWallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public double addBalance(double amount)
    {
        balance= balance+amount;
        return balance;
    }
    public double deductBalance(double dedAmount)
    {
        if(balance> dedAmount){
            balance=balance-dedAmount;
            return balance;
        }
        else
            System.out.println("Insufficient Balance: Please add money to your Wallet");
        return balance;
    }
    public boolean hasSufficientBalance(double totalAmount){
        return getBalance()>totalAmount;
    }
}
