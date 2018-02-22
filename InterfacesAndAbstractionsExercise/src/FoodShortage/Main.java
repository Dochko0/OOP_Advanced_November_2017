package FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Buyer> buyers = new HashMap<>();
        int line = Integer.parseInt(bf.readLine());

        for (int i = 0; i < line; i++) {
            String[] inputForm = bf.readLine().split(" ");
            if (inputForm.length == 3) {
                buyers.put(inputForm[0], new Person(inputForm[0]));
            } else {
                buyers.put(inputForm[0], new Rebel(inputForm[0]));
            }
        }

        while (true) {
            String[] input = bf.readLine().split(" ");
            if (input[0].equalsIgnoreCase("end")) {
                break;
            }
            if (buyers.containsKey(input[0])) {
                buyers.get(input[0]).buyFood();
            }
        }
        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());
    }
}

