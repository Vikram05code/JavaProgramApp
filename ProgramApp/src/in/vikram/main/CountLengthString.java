package in.vikram.main;
import java.util.Scanner;
public class CountLengthString {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a String value");
	   String s1 = sc.nextLine();
	   s1 = s1.replace(" ", "");
	   int count=0;
	   for(int i=1; i<=s1.length(); i++) {
		   count++;
	   }
	   System.out.println(count);
   }
}
