import java.util.*;
public class Iterattion {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Ankan",20);
        hm.put("Kanchan",60);
        hm.put("Ranu",45);
        hm.put("Riya",19);

        //iterate
        // hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k:keys) {
            System.out.println("key="+k+",value="+hm.get(k));
        }

    

    }
}
