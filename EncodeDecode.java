import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Press 1 for Code & Press 2 for Decode: ");
            int f = input.nextInt();
            input.nextLine(); 

            if (f == 1 || f == 2) {
                if (f == 1) {
                    System.out.print("Enter what you want to Code: ");
                    String s = input.nextLine();
                    if (s.length() >= 3) {
                        String code = "fsd" + s.substring(1) + s.charAt(0) + "fsd";
                        System.out.println(code);
                    } else {
                        String code = new StringBuilder(s).reverse().toString();
                        System.out.println(code);
                    }
                } else if (f == 2) {
                    System.out.print("Enter what you want to Decode: ");
                    String s = input.nextLine();
                    if (s.length() >= 3) {
                        char firstChar = s.charAt(s.length() - 4);
                        String middle = s.substring(3, s.length() - 4);
                        String code = firstChar + middle;
                        System.out.println(code);
                    } else {
                        String code = new StringBuilder(s).reverse().toString();
                        System.out.println(code);
                    }
                }
            } else {
                System.out.println("Invalid Input");
            }
        } catch (Exception e) {
            System.out.println("Please enter integer only");
        }
    }
}
