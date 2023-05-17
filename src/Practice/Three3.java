package Practice;
import java.util.*;

public class Three3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String input;
        String all = "";

        do
        {
            input = reader.nextLine();
            all += input;
        } while(!input.equals("STOP"));

        System.out.println(all);
    }
}