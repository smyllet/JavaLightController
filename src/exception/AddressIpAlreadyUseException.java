package exception;

public class AddressIpAlreadyUseException extends Exception {
    public AddressIpAlreadyUseException() {
        super();
    }

    public AddressIpAlreadyUseException(String message) {
        super(message);
    }
}
