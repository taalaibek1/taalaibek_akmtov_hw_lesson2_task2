public class Main {
    public static void main(String[] args) throws LimitException {
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

//Результат кода
//Remnant in bank account: 9000.0
//Remnant in bank account: 3000.0
//Impossible to withdraw. Insufficient funds!  Available amount: 3000.0
//Remnant in bank account: 0.0
