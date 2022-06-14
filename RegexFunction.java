package RegularExpression;

public class RegexFunction {
    void firstName() {
        String fname[] = {"JOHN", "Avita", "Om", "shree", "Abc123", "123@A"};
        for (String name : fname) {
            System.out.println("First name of user " + name + " is " + name.matches("[A-Z][a-z]{3,}"));
        }
    }

    void lastName() {
        String lname[] = {"Patil", "123Abc", "@kiwate", "$abc"};
        for (String name : lname) {
            System.out.println("Last name of user " + name + " is " + name.matches("[A-Z][a-z]{3,}"));
        }
    }

    void email() {
        String email[] = {""};
        for (String e : email) {
            System.out.println("Email of the user " + e + " is " + e.matches("[abc][\\.][a-z]+[@][bl][\\.][co][\\.][a-z]{2,3}"));
        }
    }
}
