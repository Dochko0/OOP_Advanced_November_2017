package Telephony;

public class Smartphone implements CallOtherPhones, BrowseInWorldWideWeb {
    public Smartphone() {
    }


    @Override
    public String getWWW(String www) {
        if (!www.matches("[^0-9]*")){
            return "Invalid URL!";
        }else {
            return "Browsing: "+ www+"!";
        }
    }

    @Override
    public String call(String num) {
        if (num.matches("^[0-9]+$")){
            return "Calling... "+num;
        }else{
            return "Invalid number!";
        }
    }
}
