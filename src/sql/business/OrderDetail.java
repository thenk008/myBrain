package sql.business;

/**
 * @author lidapeng
 * @description 订单详情
 * @date 11:55 上午 2020/1/3
 */
public class OrderDetail {
    private long user_id;//用户主键
    private long order_detail_id;//详情ID
    private long order_id;//订单主键
    private String shop;//购买的菜品(ID集合及数量)
    private long pack_much;//包装费
    private long all_pay;//合计费用
    
}
