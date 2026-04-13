import java.util.*;

public class HashsetImp {
    // HashSet Implement Using HashMap Internally in Java
    // Keys of HashMap are unique so HashSet element are unique
    // HashSet take only key from hahmap internally create Hasmap key + dummy value

    public static void main(String[] args) {
       HashSet<Integer> s = new HashSet<>();
       s.add(40);
       s.add(20);
       s.add(30);
       s.add(10);
       s.add(50);
       System.out.println(s);

    //    System.out.println(s.contains(10));
    //    System.out.println(s.contains(100));

    //    s.remove(10);
    //    System.out.println(s);
    //    System.out.println(s.contains(10));
       
    //    s.clear();
    //    System.out.println(s);
    //    System.out.println(s.isEmpty());
    //    System.out.println(s.size());


    LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
    lhs.add(40);
    lhs.add(20);
    lhs.add(30);
    lhs.add(10);
    lhs.add(50);
    System.out.println(lhs);

    TreeSet<Integer> ts = new TreeSet<>();
    ts.add(40);
    ts.add(20);
    ts.add(30);
    ts.add(10);
    ts.add(50);
    System.out.println(ts);

    }
}
