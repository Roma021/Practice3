import java.util.Scanner;
public class Check {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        //System.out.println("How old are you? ");
      //  int age = Integer.parseInt(reader.nextLine());


     //   if (age >= 0 && age <= 120) {
       //     System.out.println("Ok");
     //   }else {
       //     System.out.println("Imposible! ");
      //  }


        //String user1 = "alex";
        //String pass1 = "mightyducks";
        //String user2 = "emily";
        //String pass2 = "cat" ;

     //   System.out.println("Type your username: ");
     //   String user = reader.nextLine();

     //   System.out.println("Type your password: ");
     //   String pass = reader.nextLine();
     //   String user1 = "alex";
     //   String pass1 = "mightyducks";
     //   String user2 = "emily";
     //   String pass2 = "cat" ;

      //  if (user.equals(user1) && pass.equals(pass1)) {
      //      System.out.println("You are now logged into the system!");
     //   }
     //   else if (user.equals(user2) && pass.equals(pass2)) {
      //      System.out.println("You are now logged into the system!");
     //   }
      //  else {
       //     System.out.println("Your username or password was invalid!");
      //  }
        while (true) {
            System.out.println("Do you enjoy programming!");
            System.out.println("Do you want to continue? ");
            String continue1 = reader.nextLine();
            if (continue1.equals("No")) {
                break;
            }
        }
        System.out.println(" Thank you, see you later! ");
    }
}
