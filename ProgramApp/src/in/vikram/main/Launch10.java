package in.vikram.main;

public class Launch10 {
    public static void main(String[] args) {
    	int n=6;
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			if(i==0 || i==n-1 || j==(n-1)/2) {
    				System.out.print("*");
    			}else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
}