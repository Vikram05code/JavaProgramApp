package in.vikram.main;

import java.util.Arrays;

public class ArraysClass {
   public static void main(String[] args) {
	   int[] arr = new int[5];
	   Arrays.fill(arr, 10);
	   for(int a :arr) {
		   System.out.print(a+" ");
	   }
	   System.out.println();
	   int[] arr1 = {30,20,0,0,0,40,50};
	   Arrays.fill(arr1, 2, 5, 15);
	   for(int b :arr1) {
		   System.out.print(b+" ");
	   }
	   
	   System.out.println();
	   int[] arr2 = {20,10,30,5,12,60,5};
	   Arrays.sort(arr2);
	   for(int c :arr2) {
		   System.out.print(c+" ");
	   }
	   System.out.println();
	   int res = Arrays.binarySearch(arr2, 60);
	   System.out.println(res);
	   
	   
   }
}
