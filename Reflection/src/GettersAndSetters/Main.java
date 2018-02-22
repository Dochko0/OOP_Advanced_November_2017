package GettersAndSetters;

import java.lang.reflect.Field;

public class Main {
    private int age;

    private Main(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class aClass = Main.class;
        Field field = aClass.getDeclaredField("age");
       Main objectInstance = new Main(4);
       Object value = field.get(objectInstance);
       field.set(objectInstance,value);
        System.out.println(value);
    }
}
