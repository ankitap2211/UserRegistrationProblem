package RegularExpression;

import java.util.Scanner;

public class RegexMain {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration problem");
        RegexFunction r = new RegexFunction();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. First name check \n2. Last name check \n3. Mobile number check \n4. Password check" +
                    "\n5. Password at least one upper case\n6. Password at least one numeric");
            System.out.print("Enter Your Choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    r.firstName();
                    break;
                case 2:
                    r.lastName();
                    break;
                case 3:
                    r.mobile();
                    break;
                case 4:
                    r.password();
                    break;
                case 5:
                    r.passwordAtLeastOne();
                    break;
                case 6:
                    r.passwordAtLeastNum();
                    break;
            }
        } while (choice != 0);
    }

}
