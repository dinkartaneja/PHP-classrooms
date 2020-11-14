package login;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String filePath = "{abc.txt}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Checking to see if username exists...");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            boolean usernameExists = false;
            while((line = bufferedReader.readLine()) != null) {
                if (line.equals(username)) {
                    usernameExists = true;
                    break;
                }
            }
            if (usernameExists) {
                System.out.println("Username exists! Please try again.");
            } else {
                System.out.println("Username accepted");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}