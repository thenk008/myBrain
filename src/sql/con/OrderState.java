package sql.con;

/**
 * @author lidapeng
 * @description
 * @date 1:24 下午 2020/1/3
 */
public class OrderState {
    public static final int Out_Order = 1;//消费者付费出单
    public static final int Sure_Order = 1 << 1;//商家接单 开始处理订单
    public static final int Release_Order = 1 << 2;//商家把单子发布给骑手
    public static final int Deliver_Order = 1 << 3;//订单派送中
    public static final int Complet_Order = 1 << 4;//订单完成
    public static final int Destory_Order = 1 << 5;//取消订单
    public static final int Destory_Sure_Order = 1 << 6;//取消订单被确认
    public static final int Evaluate_Order = 1 << 7;//已评价
}
