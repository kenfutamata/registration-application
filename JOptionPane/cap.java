
import javax.swing.JOptionPane;

public class cap{

private String fullname; 
private String email; 
private int password; 
private String passString; 
private int passCount; 
private int spaceCount; 

public cap(String fullname, String email, int password){
    this.fullname=fullname; 
    this.email=email; 
    this.password=password;
}

public void passwordverify(){

    passString = Integer.toString(password); 
    passCount = passString.length(); 

    if(passCount >=8){
        JOptionPane.showMessageDialog(null, "Password is valid");
        displayinfo();
    }else{
        JOptionPane.showMessageDialog(null, "Password is invalid");
        System.exit(0);
    }
    

}

public void displayinfo(){
    spaceCount = fullname.indexOf(" ");
    if(spaceCount >=0){
        JOptionPane.showMessageDialog(null, "Welcome to POS " +this.fullname.substring(0, spaceCount)+"!"+"\n your full name is "+this.fullname.toUpperCase()+ "\n your email address is "+this.email.toLowerCase());
    }
    
}


}