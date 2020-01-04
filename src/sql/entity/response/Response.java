package sql.entity.response;

/**
 * @author lidapeng
 * @description 统一返回
 * @date 10:40 上午 2020/1/4
 */
public class Response {
    //userId:sessionId
    private Error error;//错误体
    private Object data;//响应，可能为NULL
}
