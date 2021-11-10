package Strings.ex2_SocialProfile;

import java.util.InputMismatchException;

public class MyException extends InputMismatchException {
    public MyException(String s) {
        super(s);
    }
}
