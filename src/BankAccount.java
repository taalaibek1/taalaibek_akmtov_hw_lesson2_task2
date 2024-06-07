public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }





    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = amount +sum;

    }

    public void withDraw(int sum) throws LimitException{
        if(sum>amount){
            throw new LimitException("Insufficient funds! ", (int) amount);
        }
        amount = amount - sum;
    }
}
