package RegularExpression;

public class RegexFunction {
    void firstName() {
        String fname[] = {"JOHN", "Avita", "Om", "shree", "Abc123", "123@A"};
        for (String name : fname) {
            System.out.println("First name of user " + name + " is " + name.matches("[A-Z][a-z]{3,}"));
        }
    }
}
