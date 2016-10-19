import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by borisgrunwald on 19/10/2016.
 */
public class RunProgram {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String fileName = userInput.next();

        try {
            Scanner input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
