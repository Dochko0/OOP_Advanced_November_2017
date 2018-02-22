package BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Identificable> things = new ArrayList<>();


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] input = bf.readLine().split(" ");
            if (input[0].equalsIgnoreCase("end")) {
                break;
            }
            if (input[0].equalsIgnoreCase("Pet")) {
                things.add(new Person(input[2]));
            }
            if (input.length == 5) {
                things.add(new Person(input[4]));
            }
        }
        String target = bf.readLine();
        //int counter = 0;
        for (Identificable thing: things) {
            if (thing.getId().endsWith(target)){
                System.out.println(thing.getId());
                //counter++;
            }
        }
//        if(counter==0){
//            System.out.println("<no output>");
//        }
    }
}
