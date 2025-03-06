import java.util.*;

public class ListClass {
    public static void main(String[] args){
        /*
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(4);
        arraylist = new ArrayList<>(Arrays.asList(1,2,3,4,0));
        System.out.println(arraylist.size());
        System.out.println(arraylist.get(3));
        System.out.println(arraylist);
        for(int i=0;i<arraylist.size();i++){
            if(arraylist.get(i) % 2==0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        arraylist.add(3,90);
        arraylist.
        System.out.println(arraylist);*/

        //LinkedList

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(23);
        linkedList = new LinkedList<>(Arrays.asList(1,3,4,7,5,66,78));
        System.out.println(linkedList);
        System.out.println(linkedList.offer(7));
        System.out.println(linkedList);

        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println("yes");
        }
    }
}
