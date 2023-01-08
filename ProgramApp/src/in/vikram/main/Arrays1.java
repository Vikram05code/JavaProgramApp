package in.vikram.main;
import java.util.Scanner;
public class Arrays1 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   int [] arr = new int[5];
	   for(int i=0; i<arr.length; i++) {
		   System.out.println("Enter the value for "+i);
		   arr[i] = sc.nextInt();
	   }
	   System.out.println("Array are elements are as follows");
	   for(int i=0; i<arr.length; i++) {
		 System.out.print(arr[i]+" ");
		 
	   }
   }
}
