package sql.business;

/**
 * @author lidapeng
 * @description 订单表
 * @date 10:57 上午 2020/1/3
 */
public class Order {
    private long bussiness_id;//商户主键
    private long order_id;//订单主键
    private long create_time;//创建时间
    private long destory_time;//删除时间
    private long user_id;//用户ID
    private long adress_id;//地址ID
    private String order_details;//订单列表
    private int pay_channel;//支付渠道
    private long all_pay;//订单费用总计
    private long discount;//优惠金额
    private long activity_id;//活动ID
    private long service_time;//预约送达时间
    private String state;//订单状态+时间戳(字符串集合，分割字符串)
}
