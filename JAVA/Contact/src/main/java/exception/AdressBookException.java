package exception;

public class AdressBookException extends Exception {
    private ResponseCode code;
    private String message;

    public AdressBookException(ResponseCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseCode getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
