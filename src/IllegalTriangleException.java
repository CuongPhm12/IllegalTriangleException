public class IllegalTriangleException extends Exception{
    private String message;

    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
