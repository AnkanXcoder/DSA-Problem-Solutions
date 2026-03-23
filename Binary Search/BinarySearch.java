import java.util.*;
public class Main {
    
    static int binarySearch(int arr[],int key) {
       int start = 0,end = arr.length-1;
       
        while(start <= end) {
            int mid = (start+end)/2;
            
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
      
    }
    
	public static void main(String[] args) {
		int arr[] = {10,20,30,50,60,70,90};
		int key = 90;
	    System.out.println("Found at "+binarySearch(arr,key));
	    
	}
}