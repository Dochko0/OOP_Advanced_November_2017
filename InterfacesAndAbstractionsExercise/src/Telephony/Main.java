package Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Smartphone smartphone = new Smartphone();

        String[] lineOfNumbers =bf.readLine().split(" ");
        String[] lineOfWWW = bf.readLine().split(" ");


        for (String number : lineOfNumbers) {
            System.out.println(smartphone.call(number));
        }
        for (String s : lineOfWWW) {
            System.out.println(smartphone.getWWW(s));
        }




    }
}
