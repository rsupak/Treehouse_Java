import java.util.Scanner;

public class GetUserInfo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name >>");
        String name = keyboard.nextLine();
        System.out.print("Please enter your age >>");
        int age = keyboard.nextInt();
        System.out.println("Your name is " + name +
            " and you are " + age + " years old.");
        
        keyboard.close();
    }
}

