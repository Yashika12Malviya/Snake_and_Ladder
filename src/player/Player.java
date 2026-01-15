package player;
import java.util.*;

public class Player {
    String name;
    int age;
    String address;
    String contactNo;
    String emailId;
    Scanner in = new Scanner(System.in);

    public void SetPlayerDetails(String name, int age, String address, String contactNo, String  emailId){
        this.name = name;
        this.address = address;
        this.age = age;
        this.contactNo = contactNo;
        this.emailId = emailId;
    }

    public void SetPlayerName(String name){
        this.name = name;
    }

    public void PlayerNameAndAge (String name, int age){
        this.name = name;
        this.age= age;
    }
    public String GetPlayerName(){
        return  this.name;
    }
    public void GetPlayerDetails(){
        System.out.println("Player's Name : " + this.name);
        System.out.println("Player's age : " + this.age);
        System.out.println("Player's Address : " + this.address);
        System.out.println("Player's emailId : " + this.emailId);
        System.out.println("Player's contactNo : " + this.contactNo);
    }
    public void SetPlayerDetailsFromUserInput(Player p) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the PLayer Details : ");

        System.out.println("Enter the PLayer Name : ");
        String name = in.nextLine();
        System.out.println("Enter the PLayer Address : ");
        String address = in.nextLine();
        System.out.println("Enter the PLayer ContactNo : ");
        String contactNo = in.nextLine();
        System.out.println("Enter the PLayer EmailId : ");
        String emailId = in.nextLine();
        System.out.println("Enter the PLayer Age : ");
        int age = in.nextInt();

        p.SetPlayerDetails(name, age, address, contactNo, emailId);
    }
}
