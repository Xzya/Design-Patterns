package facade;

public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecutityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck) {
        if (secCodeToCheck == getSecutityCode()) {
            return true;
        } else {
            System.out.println("ERROR: Security Code is Wrong.");
            return false;
        }
    }
}
