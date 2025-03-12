import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//                                                       1 part
//class Gen<T>{
//        ArrayList<T> list;
//        public Gen(){
//            list = new ArrayList<>();
//        }
//        public void add(T item){
//            list.add(item);
//        }
//        public ArrayList<T> getlist(){
//            return list;
//        }
//
//        public ArrayList<T> addLists(Gen<T> otherlist){
//            boolean res = this.list.addAll(otherlist.getlist());
//            return list;
//        }
//        }
//
//public class GenericsLab {
//    public static void main(String[] args) {
//        Gen<Integer> list1 = new Gen<>();
//        list1.add(11);
//        Gen<Integer> list2 = new Gen<>();
//        list2.add(12);
//
//        System.out.println(list1.addLists(list2));
//
//     }
//}
// //////////////////////////////////////////////////////////////////////////////
// 2 part //////////////
//class Gen<T,K>{
//    HashMap<T,K> map;
//    public Gen(){
//        map = new HashMap<>();
//    }
//    public void addformap(T t,K k){
//        map.put(t,k);
//    }
//
//    public void getItems(){
//        for(Map.Entry<T,K> item: map.entrySet()){
//            System.out.println(item.getKey() + " " + item.getValue());
//        }
//    }
//
//}
//public class GenericsLab {
//    public static void main(String[] args) {
//        Gen<Integer,String> map = new Gen<>();
//        map.addformap(1,"dahfkjd");
//        map.addformap(2,"allll");
//        map.getItems();
//    }
//}
// /////////////////////////////////////////
