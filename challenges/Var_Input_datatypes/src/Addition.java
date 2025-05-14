import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to be added:");
        System.out.print("Number 1: ");
        int Num1 = input.nextInt();
        System.out.print("Number 2: ");
        int Num2 = input.nextInt();
        int sum = Num1 + Num2;
        System.out.println("Sum of " +Num1 + " and " + Num2 +" is " + sum);
    }
}
