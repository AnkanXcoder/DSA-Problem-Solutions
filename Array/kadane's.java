public class Main {
    
    public static void kadnes(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs,ms);
        }
        System.out.println("Our maximum sub array sum is "+ms);
    }
    
    
    
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadnes(arr);
    }
}