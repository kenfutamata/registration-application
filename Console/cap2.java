public class cap2 {
    private String fullname; 
private String email; 
private int password; 
private String passString; 
private int passCount; 
private int spaceCount; 

public cap2(String fullname, String email, int password){
    this.fullname=fullname; 
    this.email=email; 
    this.password=password;
}

public void passwordverify(){

    passString = Integer.toString(password); 
    passCount = passString.length(); 

    if(passCount >=8){
        System.out.println("Password is valid");
        displayinfo();
    }else{
        System.out.println("Password is invalid");
        System.exit(0);
    }
    

}

public void displayinfo(){
    spaceCount = fullname.indexOf(" ");
    if(spaceCount >=0){
        System.out.println("Welcome to POS " +this.fullname.substring(0, spaceCount));
        System.out.println("your full name is "+this.fullname.toUpperCase());
        System.out.println("your email address is "+this.email.toLowerCase());
    }
    
}
}
