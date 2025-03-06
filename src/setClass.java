import java.util.*;

public class setClass {
    public static void main(String[] args) {
        //HashSet
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(7,1,2,3,6,5,2,9,0));
        System.out.println(hs);
        hs.add(10);
        System.out.println(hs);
        System.out.println(hs.size());



        //LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(1,4,7,2,3,7));
        System.out.println(lhs);
        lhs.addLast(0);
        lhs.reversed();
        System.out.println(lhs.reversed());

        //TreeSet
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(1,5,2,4,7,9,5));
        System.out.println(ts);
        System.out.println(ts);

//        Iterator<Integer> iter = ts.descendingIterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next()+ "  ");
//        }
    }
}
