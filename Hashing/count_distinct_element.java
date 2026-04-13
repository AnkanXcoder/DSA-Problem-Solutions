import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		int arr[] = {4,5,8,9,4,4,6,7,8,10,14,12,14};
		
		for(int i=0;i<arr.length;i++) {
		    set.add(arr[i]);
		}
		
		System.out.print(set);
	}
}