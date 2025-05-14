import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=input.nextLine();
        System.out.println("How are you "+ name);
        System.out.print(name + ", also mention your age: ");
        int age =input.nextInt();
        System.out.println(name + " you are "+ age +" years old");


    }
}
