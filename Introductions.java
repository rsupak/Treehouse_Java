import java.io.Console;
/*
    Treehouse Java introductions
*/

public class Introductions
{
    public static void main(String[] args)
    {
        Console console = System.console();
        String name = "Rich";
        String format = "Hi! My name is %s!\n";
		console.printf(format, name);
    }
}