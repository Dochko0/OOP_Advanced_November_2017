package src.p05_security_system;

public class KeyCardCheck extends SecurityCheck implements KeyCardUi{

    private PinCodeUi securityUI;

    public KeyCardCheck(PinCodeUi securityUI) {
        this.securityUI = securityUI;
    }
//
//    @Override
//    public boolean validateUser() {
//        String code = this.requestKeyCard();
//        if (isValid(code)) {
//            return true;
//        }
//
//        return false;
//    }

    private boolean isValid(String code) {
        return true;
    }

    @Override
    public String requestKeyCard() {
        return "slide your key card";
    }
}
