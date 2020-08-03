package commons;

public class CmndException extends Exception {
    public CmndException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter cmnd error: "+super.getMessage();
    }
}
