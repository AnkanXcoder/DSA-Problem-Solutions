public class Main {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            largest = Math.max(arr[i],largest);
        }
        
        int count[] = new int[largest+1]; // if we take 8 value  then largest 7 but value 8  that's why largest + 1
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        // count/ frequency check --> use original Array
        // sorting --> use count array
       
        //sorting
        int j = 0; // original array
        for(int i=0;i<count.length;i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
	    int arr[] = {1,4,1,3,2,4,3,7};
	    countingSort(arr);
	    printArr(arr);
	}
}