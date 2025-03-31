import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String addresses = "1.76.54  567.765.890.342  43.258.218.10  192.168.1.10  76.345.6";
        String regex = "\\b((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}1?\\d?\\d|\\2\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(addresses);
        boolean isExist = matcher.find();
        if(isExist){
            System.out.println("Корректный адрес: "+matcher.group(0));
        }
    }
}