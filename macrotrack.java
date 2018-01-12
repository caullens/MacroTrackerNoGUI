import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class macrotrack {
  public static void main(String[] args) {
    File f = new File("user-info.txt");
    if(f.exists()) {
      // Read the info
      try {
        Scanner s = new Scanner(f);
        String username = s.nextLine();
        System.out.println("Welcome back " + username + ". What would you like to do?");
      } catch(Exception e) {
        System.out.println(e.toString());
      }
    } else {
      // Create file and fill with initial info
      Scanner s = new Scanner(System.in);
      System.out.print("Please choose a username: ");
      String input = s.nextLine();
      try {
        FileWriter fw = new FileWriter(f);
        fw.write(input);
        fw.close();
      } catch(Exception e) {
        System.out.println(e.toString());
      }
    }
  }
}
