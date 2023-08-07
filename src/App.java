import java.util.ArrayList;
import java.util.List;

public class App {
    List<Node<Integer>> list;
    public App(){
        list = new ArrayList<Node<Integer>>();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Tjena Börje!");
    }


    public class Node<E>{

        public E data;
        public Node<E> next; 

        public Node(E e){
            data = e;
            next = null;
        }


    }
}

