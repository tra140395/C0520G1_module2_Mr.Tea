package commons;

public class EmailException extends Exception{
    public EmailException(String massage){
        super(massage);
    }

    @Override
    public String toString() {
        return "Enter email error: "+super.getMessage();
    }
}

