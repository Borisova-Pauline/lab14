import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String addresses = "1.76.54  567.765.890.342  43.255.218.10  192.168.1.10  76.345.6  192.168.2.20";
        Pattern p1 = Pattern.compile("((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}1?\\d?\\d");
        Pattern p2 = Pattern.compile("\\s+");
        Matcher m;
        String[] ids = p2.split(addresses);
        for(String i: ids){
            m = p1.matcher(i);
            if(m.matches()){
                System.out.println("Корректный адрес: "+i);
            }
        }
    }
}