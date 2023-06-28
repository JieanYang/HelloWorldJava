import java.util.Scanner;

class inputprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String firstName = input.next();

        System.out.print("Enter your last name : ");
        String lastName = input.next();

        System.out.println("Your Full Name is " + firstName + " " + lastName);
    }

}
