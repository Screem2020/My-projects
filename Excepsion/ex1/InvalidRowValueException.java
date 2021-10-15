package Excepsion.ex1;

public class InvalidRowValueException  extends RuntimeException{

    public InvalidRowValueException(String message) {
        super(message);
    }
}
