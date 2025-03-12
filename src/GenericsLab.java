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
// 3 part
import java.util.*;

class Task implements Comparable<Task> {
    String name;
    int prio;
    int time;

    public Task(String name, int prio, int time) {
        this.name = name;
        this.prio = prio;
        this.time = time;
    }

    @Override
    public int compareTo(Task t) {
        if (t.prio != this.prio) {
            return t.prio - this.prio;
        } else {
            return this.time - t.time;
        }
    }

    @Override
    public String toString() {
        return "priority-" + prio + "; " + name + " time--(" + time + "m)";
    }
}

class TaskScheduler {
    private PriorityQueue<Task> tasks = new PriorityQueue<>();
    private Queue<Task> pending = new LinkedList<>();
    void add(Task t) {
        tasks.add(t);
        System.out.println("+ " + t);
    }
    void process() {
        System.out.println(tasks.isEmpty() ? "no tasks." : "- " + tasks.poll());
    }
    void delay() {
        if (!tasks.isEmpty()) pending.add(tasks.poll());
    }
    void retrieve() {
        if (!pending.isEmpty()) tasks.add(pending.poll());
    }
    void show() {
        System.out.println("Tasks--- " + tasks);
        System.out.println("Pending--- " + pending);
    }
}
public class GenericsLab {
    public static void main(String[] args) {
        TaskScheduler s = new TaskScheduler();
        s.add(new Task("Review", 3, 20));
        s.add(new Task("Update", 5, 45));
        s.add(new Task("Backup", 2, 30));
        s.add(new Task("Deploy", 5, 50));
        s.add(new Task("Fix", 4, 25));

        s.show();
        s.process();
        s.delay();
        s.show();
    }
}
