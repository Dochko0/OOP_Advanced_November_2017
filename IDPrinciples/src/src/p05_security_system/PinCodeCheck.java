package src.p05_security_system;

public class PinCodeCheck extends SecurityCheck implements PinCodeUi{

    private PinCodeUi securityUI;

    public PinCodeCheck(PinCodeUi securityUI) {
        this.securityUI = securityUI;
    }

//    @Override
//    public boolean validateUser() {
//        int pin = securityUI.requestPinCode();
//        if (isValid(pin)) {
//            return true;
//        }
//
//        return false;
//    }

    private boolean isValid(int pin) {
        return true;
    }

    @Override
    public int requestPinCode() {
        return 0;
    }
}
