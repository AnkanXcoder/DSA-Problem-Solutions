public class Main {
    
    static void reverseArray(int arr[]) {
        int start = 0,end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
    }
    
	public static void main(String[] args) {
	    int arr[] = {10,20,78,56,20,17,11,4,2007,2006};
	    reverseArray(arr);
	    for(int i=0;i<arr.length;i++) {
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    
	}
}