package handler;

class ConcreteHandler1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(1);
    }

    @Override
    public Response response(Request request) {
        System.out.println("该请求为ConcreteHandler1 处理");
        return new Response("响应结果 1");
    }
}

class ConcreteHandler2 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return new Level(2);
    }

    @Override
    public Response response(Request request) {
        System.out.println("该请求为ConcreteHandler2 处理");
        return new Response("响应结果 2");
    }
}

class ConcreteHandler3 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return new Level(3);
    }

    @Override
    public Response response(Request request) {
        System.out.println("该请求为ConcreteHandler3 处理");
        return new Response("响应结果 3");
    }
}
