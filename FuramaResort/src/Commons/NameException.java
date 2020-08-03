package commons;

public class NameException extends Exception{
    public NameException(String massage){
        super(massage);
    }

    @Override
    public String toString() {
        return "Enter name error: "+super.getMessage();
    }
}
