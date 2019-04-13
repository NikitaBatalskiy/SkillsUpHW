package HWException;

public class MoneyNotEnoughException extends Exception{
    private String message;

    public MoneyNotEnoughException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
