import java.util.*;
public class LinkedHasmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Ankan",40);
        lhm.put("Riya", 19);
        lhm.put("kanchan",60);
        lhm.put("Ranu",45);


        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Ankan",40);
        hm.put("Riya", 19);
        hm.put("kanchan",60);
        hm.put("Ranu",45);
        System.out.println(hm);
        System.out.println(lhm);


        // only difference between linkedhashmap and hashmap is linkedhashmap keys are ordered

        // Hashmap implement using Array of singly LinkedList
        // LinkedHashmap implement using Array of Doubly LinkedList that's is reason why ordered

        // both time complexity are O(1)
    }
}
