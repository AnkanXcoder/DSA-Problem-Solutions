import java.util.Arrays;
public class Main {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
	    int arr[] = {14,10,2,5,6,8,9,21,4};
	    Arrays.sort(arr);
	    printArr(arr);
	}
}

// this is java inbuilt sort function and it's time complexity is O(nlogn)