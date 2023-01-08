package in.vikram.main;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {10,20,30,40,50,60,70};
		System.out.println("Enter target element");
		int target = sc.nextInt();
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(target == arr[i]) {
				System.out.println("Target "+target+" found at index "+i);
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Target not found");
		}
	}

}
