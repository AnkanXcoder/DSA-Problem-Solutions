import java.util.*;
public class Main {
    
    static int FindLargestSmallest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    
	public static void main(String[] args) {
		int arr[] = {10,20,78,50,40,12,96};
		System.out.print("smallest number is "+FindLargestSmallest(arr));
	}
}