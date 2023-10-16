package livehouses;

public class CreditCard {
    public String number;
    public String cvv;
    public String address;
    public String bankName;

    public CreditCard(String number, String cvv, String address, String bankName) {
        this.number = number;
        this.cvv = cvv;
        this.address = address;
        this.bankName = bankName;
    }

    // Deberíamos hacer una validación según el banco
    public static boolean isValidNumber(String number) {
        return number.length() == 16;
    }

    public static boolean isValidCVV(String cvv) {
        return cvv.length() == 3 && cvv.matches("[0-9]+");
    }

    public static boolean isValidAddress(String address) {
        return address.length() > 0 && LiveHouseUser.EmailValidation.isValidEmail(address);
    }

    public static boolean isValidBankName(String bankName) {
        return bankName.length() > 0;
    }
}
