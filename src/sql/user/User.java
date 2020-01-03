package sql.user;

/**
 * @author lidapeng
 * 用户表
 * @date 9:28 上午 2020/1/3
 */
public class User {
    private String unid;//第三方唯一ID
    private String tel_nub;//手机号码
    private int channel;//账号渠道
    private long user_id;//用户主键
    private int state;//账号状态
    private long create_time;//创建时间
    private long end_time;//结束时间是的
    private String note;//用户备注
    private long money;//用户余额
    private String birthday;//生日
    private String collection;//收藏（保存的店面ID集合，分割字符串）
}
