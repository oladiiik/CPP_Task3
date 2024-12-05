//
//Витягнення дат з тексту
//Знайти всі дати формату DD/MM/YYYY у тексті.

import java.util.regex.*;
import java.util.ArrayList;

public class DateExtractor {
    public static void main(String[] args) {
        String text = "The events are scheduled on 12/05/2023, 25/12/2023, and 01/01/2024.";
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }

        System.out.println("Found dates: " + dates);
    }
}
