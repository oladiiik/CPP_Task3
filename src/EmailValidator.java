//
//Перевірка формату email-адреси
//

import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "exa.mple@lpnu.ua";
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}
