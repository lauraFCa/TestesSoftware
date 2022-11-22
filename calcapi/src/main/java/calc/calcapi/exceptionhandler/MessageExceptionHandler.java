package calc.calcapi.exceptionhandler;

public class MessageExceptionHandler {
    
    private String message;

    public MessageExceptionHandler(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String msg){
        this.message = msg;
    }
}
