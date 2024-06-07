public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(15000);
        try {
            while (true) {
                bankAccount.withDraw(6000);
                System.out.println("Remnant in bank accoun:" + bankAccount.getAmount());
            }
            }catch (LimitException e){
            System.out.println("Impossible to withdraw. " + e.getMessage() + " Available sums are: " + e.getRemainingAmount());
        }
    }
}