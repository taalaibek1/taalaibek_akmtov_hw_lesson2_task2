public class LimitException extends Exception{

    private double remainingAmount;




    public LimitException(String message, int remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }


}
