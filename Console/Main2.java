
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int password; 
        String fullname; 
        String email;

        fullname = input.nextLine(); 
        email = input.nextLine(); 
        password = input.nextInt();
        cap2 j1 = new cap2(fullname, email, password);
        j1.passwordverify();
    }
}
