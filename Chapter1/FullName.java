import java.io.Console;

public class FullName
{
    public static void main(String[] args)
    {

        Console console = System.console();
        String firstName = "Richard";
        String lastName = "Supak";
        String string = "Hello, My name is %s %s\n";
		console.printf(string, firstName, lastName);

    }
}