package BorderControl;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Identificable> citizens = new ArrayList<>();


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] input = bf.readLine().split(" ");
            if (input[0].equalsIgnoreCase("end")) {
                break;
            }
            if (input.length == 3) {
                citizens.add(new Person(input[2]));
            }
            if (input.length == 2) {
                citizens.add(new Person(input[1]));
            }
        }
        String target = bf.readLine();
        for (Identificable citizen : citizens) {
            if (citizen.getId().endsWith(target)){
                System.out.println(citizen.getId());
            }
        }
    }
}
