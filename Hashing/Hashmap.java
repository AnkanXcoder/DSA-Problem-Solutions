import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        //Create 
        HashMap<String,Integer> hm = new HashMap<>();

        //insert - O(n)
        hm.put("Tea",10);
        hm.put("Coffee",40);
        hm.put("Pizza",250);

        System.out.println(hm); // unorder map

        // get - O(n)
        int price = hm.get("Tea");
        System.out.println(price);

        System.out.println(hm.get("Muri")); // if key not exist it gives Null value

        // containskey - O(1)
        System.out.println(hm.containsKey("Tea")); // true
        System.out.println(hm.containsKey("Muri")); // false

        // remove - O(1)
        System.out.println(hm.remove("Pizza"));
        System.out.println(hm);

        // size - O(1)
        System.out.println(hm.size());

        // is empty - O(1)
        System.out.println(hm.isEmpty());

        // clear
        // hm.clear();

    }
}
