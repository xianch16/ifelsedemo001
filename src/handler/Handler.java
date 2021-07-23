package handler;

public abstract class Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final Response handlerRequest(Request request) {
        Response response = null;
        if (this.getHandlerLevel().above(request.getLevel())) {
            response = this.response(request);
        }else{
            if (nextHandler != null) {
                response = this.nextHandler.handlerRequest(request);
            }else{
                System.out.println("没有合适的处理器");
            }
        }
        return response;

    }

    protected abstract Level getHandlerLevel();

    public abstract Response response(Request request);

}
