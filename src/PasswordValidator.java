//
//Перевірка пароля на складність
//Перевірити, чи пароль містить хоча б одну велику літеру, одну цифру і є довжиною від 8 до 20 символів.



public class PasswordValidator {
    public static void main(String[] args) {
        String password = "StrongPass123";
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,20}$";

        if (password.matches(regex)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }
}
