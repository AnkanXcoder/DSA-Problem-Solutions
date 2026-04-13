import java.util.*;

public class TreeMapCode {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("Ankan",40);
        tm.put("Riya", 19);
        tm.put("Kanchan",60);
        tm.put("Ranu",45);


        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Ankan",40);
        hm.put("Riya", 19);
        hm.put("Kanchan",60);
        hm.put("Ranu",45);
        System.out.println(hm);
        System.out.println(tm);

        // keys are sorted 
        // Time Complexity is O(logn)

    }
}
