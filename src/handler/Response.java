package handler;

public class Response {
    private  String message;

    public Response(String message) {
        System.out.println("处理完成");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
