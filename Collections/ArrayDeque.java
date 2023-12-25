package Collections;
import java.util.Collections;
import java.util.ArrayDeque;

class ArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);

        arrayDeque.offerFirst(100);
        for(Integer ele: arrayDeque){
            System.out.println(ele);
        }
    
    }

}
