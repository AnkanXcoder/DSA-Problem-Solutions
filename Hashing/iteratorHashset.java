import java.util.*;
public class iteratorHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Kolkata");
        cities.add("Bankura");
        cities.add("Haldia");
        cities.add("Bishnupur");
        cities.add("Guwahati");
        cities.add("Shilong");
        System.out.println(cities);

        //using iterator

        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }
    
        // using for each loop
        for(String city:cities) {
            System.out.println(city);
        }

        


        
    }
}
