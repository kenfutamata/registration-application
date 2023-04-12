
import javax.swing.JOptionPane; 
public class Main {
    public static void main(String[] args) {
        int password; 
        String fullname; 
        String email;

        fullname = JOptionPane.showInputDialog(null, "Enter fullname");
        email = JOptionPane.showInputDialog(null, "Enter email");
        password = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Password")); 
        cap j1 = new cap(fullname, email, password);
        j1.passwordverify();
    }
}
