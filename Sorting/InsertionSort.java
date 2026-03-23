public class Main  {
    
    public static void InsertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            int curr = i;
            int prev = i-1;
            
        while(prev>=0 && arr[prev] > arr[curr]) {
           arr[prev+1] = arr[prev]; 
           prev--;
        }
        
        arr[prev+1] = curr;
        }
    }
    
    static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
	public static void main(String[] args) {
		int arr[] = {5,4,10,1,6,2};
	    InsertionSort(arr);
		printArr(arr);
	}
}