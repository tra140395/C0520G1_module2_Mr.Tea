package commons;

public class BirthdayException extends Exception {
    public BirthdayException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Enter birthday error: "+super.getMessage();
    }
}
