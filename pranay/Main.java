import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input = 0;
        System.out.println("Enter your input value");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        if (input % 2==0) {
            System.out.println("your input value is even");
        }
        else {
            System.out.println("input value is odd");
        }



    }
}