package Reflection;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class reflectClass = Reflection.class;
        System.out.println("class " + reflectClass.getSimpleName());
        System.out.println(reflectClass.getSuperclass());
        Class[] interfaces = reflectClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
            
        }

        Reflection instence = (Reflection) reflectClass.newInstance();
        System.out.println(instence);
    }
}
