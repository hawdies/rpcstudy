package enums;

/**
 * @author hawdies
 * @date 2021/5/6
 **/
public enum RpcErrorMessageEnum {
    CLIENT_CONNECT_SERVER_FAILURE("客户端连接服务器失败"),
    SERVICE_INVOCATION_FAILURE("服务调用失败"),
    SERVICE_CAN_NOT_BE_FOUND("未找到指定的服务"),
    SERVICE_NOT_IMPLEMENT_ANY_INTERFACE("注册的服务没有实现接口"),
    REQUEST_NOT_MATCH_RESPONSE("返回结果错误!请求和返回的响应不匹配");

    private final String message;


    RpcErrorMessageEnum(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }
}
