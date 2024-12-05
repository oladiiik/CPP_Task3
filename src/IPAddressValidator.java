//
//Перевірка IP-адреси
//Перевірити, чи введений рядок є дійсною IPv4-адресою.

public class IPAddressValidator {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        String regex = "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";

        if (ip.matches(regex)) {
            System.out.println(ip + " is a valid IPv4 address.");
        } else {
            System.out.println(ip + " is not a valid IPv4 address.");
        }
    }
}
