package swed.it.academy.project;

public class UnknownShapeException extends Exception {

    private String textMessage;

    public UnknownShapeException(String message) {
        this.textMessage = message;
    }
    @Override
    public String getMessage() {
        return textMessage;
    }
}
