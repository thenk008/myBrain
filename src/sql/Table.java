package sql;

import sql.activity.Activity;
import sql.business.*;
import sql.con.OrderState;
import sql.user.*;

/**
 * @author lidapeng
 * @description
 * @date 2:26 下午 2020/1/4
 */
public class Table {//数据库表目录
    private Adress adress;//用户收货地址
    private Healthy healthy;//用户每日健康表
    private HealthyAll healthyAll;//用户总健康数据
    private Money money;//用户钱包
    private PayNote payNote;//用户钱包的支付/消费记录
    private User user;//用户表
    private OrderState orderState;//订单状态常量表
    private Business business;//商家表
    private BusinessMessage businessMessage;//商家公告及好评
    private BussinessTalk bussinessTalk;//商家评价，一个商家一个单独的表
    private Classification classification;//菜品分类
    private Menu menu;//菜品管理
    private MenuType menuType;//菜品标签
    private Order order;//订单表
    private OrderDetail orderDetail;//订单细节
    private Activity activity;//活动
}
