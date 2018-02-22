package GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {
    public ArrayCreator(){}

    public static <T> T[] create(int lenght, T item){
        Object[] objects = new Object[lenght];

        for (int i = 0; i < lenght; i++) {
            objects[i]=item;
        }
        return (T[])objects;
    }

    public static <T> T[] create(Class<T> someClass, int lenght, T item){
        T[] objects = (T[]) Array.newInstance(someClass, lenght);
        for (int i = 0; i < lenght; i++) {
            objects[i] = item;
        }
        return objects;
    }
}
