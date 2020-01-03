package sql.user;

/**
 * @author lidapeng
 * @description 用户收货地址
 * @date 11:14 上午 2020/1/3
 */
public class Adress {
    private long user_id;//用户ID  key
    private long adress_id;//地址ID key
    private String adress;//详细地址
    private String position;//坐标地址
    private double x;//X坐标
    private double y;//Y坐标
    private long create_time;//创建时间
    private long destory_time;//删除时间
    private String name;//联系人姓名
    private int sex;//性别
    private String tel_nub;//联系人手机号
}
