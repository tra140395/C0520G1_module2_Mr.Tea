package commons;

public class GenderException extends Exception {
    public GenderException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter gender error: "+super.getMessage();
    }
}
