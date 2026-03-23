public class Main {
    
    static int trappedWater(int arr[]) {
        int n = arr.length;
        // leftMax boundary
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++) {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }
        
        // right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--) {
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }
        
        // loop 
        int trappedWater = 0;
        int waterlevel = 0;
        for(int i=0;i<n;i++) {
            waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater+= waterlevel - arr[i];
        }
        
        return trappedWater;
    }
    
	public static void main(String[] args) {
	    int arr[] = {4,2,0,6,3,2,1,5};
	    System.out.println("Total trappedWater is "+trappedWater(arr));
	}
}