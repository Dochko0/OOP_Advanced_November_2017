package SayHelloExtend;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persones = new ArrayList<>();


        persones.add(new Bulgarian("Pesho"));
        persones.add(new European("Pesho" ));
        persones.add(new Chinese("Pesho"));

        for (Person person : persones) {
            print(person);
        }
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }
}
