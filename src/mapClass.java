import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapClass {
    public static void main(String[] args) {
        //HashMap
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(5,"id");
        hm.put(0,"asngnfd");
        System.out.println(hm);
        for(Map.Entry<Integer,String> item: hm.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
            System.out.println(item);
        }
//        System.out.println("iterating method");
//        Iterator<Map.Entry<Integer,String>> iter2 = hm.entrySet().iterator();
//        while(iter2.hasNext()){
//            Map.Entry<Integer,String> n =iter2.next();
//            System.out.println(n.getKey() + " "+ n.getValue());
        //ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(32);ad.push(1);ad.push(90);
        for (Integer i:ad){
            System.out.println(ad.pop());
        }
        ad.offer(1);ad.offer(3);ad.offer(6);
        System.out.println(ad);
        ad.addLast(7);
        ad.addFirst(-1);
        System.out.println(ad);
        }
    }

