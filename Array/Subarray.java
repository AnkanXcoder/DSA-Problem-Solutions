public class Main {
    
static void SubArraySum(int arr[]) {
    int ts = 0;
    for(int i=0;i<arr.length;i++) {
        int start = i;
        for(int j=i;j<arr.length;j++) {
            int end = j;
            
            for(int k=start;k<=end;k++) {
                System.out.print(arr[k]+" ");
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("Total pair:" + ts);
}
	public static void main(String[] args) {
	    int arr[] = {10,85,45,20,456};
		SubArraySum(arr);
	}
}