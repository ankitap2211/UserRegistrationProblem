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

    void mobile() {
        String phNumber[] = {"8974561231", "91 12345678912", "90 789546123", "91 789456", "91 9919819801"};
        for (String name : phNumber) {
            System.out.println("Mobile number of user " + name + " is " + name.matches("^(91\s)[789][0-9]{9}$"));
        }
    }

    void passwordAtLeastOne() {
        String password1[] = {"Ascbhyesw", "1wertahs", "@wersdfgh", "AAlkhyts", "a123smnh"};
        for (String name : password1) {
            System.out.println("Password at least one upper case of user " + name + " is " + name.matches("[A-Z]{1}[a-z]{8,}"));
        }
    }
}






