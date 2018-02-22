package extendedArrList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;

public class ExtArrList<T extends Comparable> extends ArrayList<T>{

    public T max(){
        BiFunction<T,T, Boolean> function = new BiFunction<T, T, Boolean>() {
            @Override
            public Boolean apply(T t, T t2) {
                return t.compareTo(t2)<0;
            }
        };
        return getMaxOrMin(function);
    }

    public T min(){
        BiFunction<T,T, Boolean> function = new BiFunction<T, T, Boolean>() {
            @Override
            public Boolean apply(T t, T t2) {
                return t.compareTo(t2)>0;
            }
        };
        return getMaxOrMin(function);
    }

    private T getMaxOrMin(BiFunction<T,T,Boolean> function){
        T maxOrMin=null;
        Iterator<T> iterator = super.iterator();
        while (iterator.hasNext()){
            T nextElement = iterator.next();
            if(maxOrMin==null || function.apply(maxOrMin,nextElement)){
                maxOrMin=nextElement;
            }
        }
        return maxOrMin;
    }

    public static void main(String[] args) {
        ExtArrList<Integer> num = new ExtArrList<>();
        num.add(100);
        num.add(1000);
        num.add(-100);
        num.add(1000000);
        num.add(101);

        System.out.println(num.max());
        System.out.println(num.min());
    }

}
