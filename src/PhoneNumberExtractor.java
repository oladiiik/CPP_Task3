//
//Витягнення телефонних номерів з тексту
//Знайти всі телефонні номери у тексті формату (XXX) XXX-XXXX.


import java.util.regex.*;
import java.util.ArrayList;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        String text = "Call me at (123) 456-7890 or (987) 654-3210.";
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> phoneNumbers = new ArrayList<>();
        while (matcher.find()) {
            phoneNumbers.add(matcher.group());
        }

        System.out.println("Found phone numbers: " + phoneNumbers);
    }
}
