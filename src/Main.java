public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(15000);
        try {
            while (true) {
                bankAccount.withDraw(6000);
                System.out.println("Remnant in bank account: " + bankAccount.getAmount());
            }
        } catch (LimitException e) {
            System.out.println("Impossible to withdraw. " + e.getMessage() + " Available amount: " + e.getRemainingAmount());
            bankAccount.withDraw((int) bankAccount.getAmount());
            System.out.println("Remnant in bank account: " + bankAccount.getAmount());
        }
    }
}
