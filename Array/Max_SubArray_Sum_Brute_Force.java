
public class Main {
    
static void MaxSubArraySum(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++) {
        int start = i;
        for(int j=i;j<arr.length;j++) {
            int end = j;
            currSum = 0;
            
            for(int k=start;k<=end;k++) {
                currSum+=arr[k];
            }
            System.out.println("Currsum is "+currSum);
            if(currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println();
    }
    System.out.println("max sum:" + maxSum);
}
    public static void main(String[] args) {
        int arr[] = {10,85,45,20,456};
        MaxSubArraySum(arr);
    }
}