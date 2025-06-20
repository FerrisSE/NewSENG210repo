//Adding new feature to slice pizza!!!
import java.util.Scanner;
public class slicer  {

public static void main(String [] args) {
System.out.println("�How would you like your pizza slice?�");

Scanner scnr = new Scanner(System.in);
String text = scnr.nextLine();

System.out.println("�Thank you for choosing: �" + text);

scnr.close();
}

}
 


