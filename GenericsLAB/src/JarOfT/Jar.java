package JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<E> {
    private Deque<E> content= new ArrayDeque<>();

    public void add(E element){
        content.push(element);
    }

    public E remove(){
     return this.content.pop();
    }
}
