import java.util.*;
public class Main {
	public static void main(String[] args) {
		int matrix[][] = new int[3][3];
		int n = matrix.length, m = matrix[0].length;
		// matrix[0] = first row and it's length = total columns
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your element: ");
		for(int i=0;i<n;i++) {
		    for(int j=0;j<m;j++) {
		        matrix[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("Print Matrix::");
		for(int i=0;i<n;i++) {
		   for(int j=0;j<m;j++) {
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
	}
}