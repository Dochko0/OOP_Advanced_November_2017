package src.p05_security_system;

import java.util.Scanner;

public class ScannerUI implements PinCodeUi, KeyCardUi {

    private Scanner scanner;

    public ScannerUI() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String requestKeyCard() {
        System.out.println();
        return this.scanner.nextLine();
    }

    @Override
    public int requestPinCode() {
        System.out.println();
        return Integer.parseInt(this.scanner.nextLine());
    }
}
