package sql.entity;

/**
 * @author lidapeng
 * @description 商家登陆
 * 登陆方式：POST-JSON
 * @date 10:30 上午 2020/1/4
 */
public class Login {
    private String telNub;//电话号码 一键登录
    private String code;//微信登陆CODE 微信登陆
    private String shortMessage; //短信登陆
}
