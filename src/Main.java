import main.java.com.datingapp.UserProfile;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserProfile user=new UserProfile("Gipsz Jakab","gipszjakab@gmail.com",20);
        System.out.println("Felhasználónév:"+user.getUsername()+", Emailcím:"+user.getEmail()+", Életkor:"+user.getAge());

    }
}