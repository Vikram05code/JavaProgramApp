package in.vikram.main;
import java.util.Scanner;

public class BinarySearch1 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int [] arr = {12,25,30,35,50,65,70,85,90};
	   System.out.println("Enter target element");
	   int target = sc.nextInt();
	   int low = 0;
	   int high = arr.length-1;
	   while(low<=high) {
		   int mid = (low+high)/2;
		   if(target == arr[mid]) {
			   System.out.println("Target "+target +" found at index "+mid);
			   break;
		   }
		   else if(target<arr[mid]) {
			   high = mid-1;
		   }
		   else if(target>arr[mid]) {
			   low=mid+1;
		   }
	   }
	   if(low>high) {
		   System.out.println("Target not found");
	   }
   }
}
