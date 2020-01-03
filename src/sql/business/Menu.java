package sql.business;

/**
 * @author lidapeng
 * @description 菜品管理
 * @date 9:51 上午 2020/1/3
 */
public class Menu {
    private long user_id;//用户主键
    private long food_id;//菜品ID
    private String food_name;//菜品名称
    private int type;//分类ID
    private double capacity;//规格
    private long unit_price;//菜品单价
    private long much;//包装价格
    private int supply_nub;//目前菜品的数量
    private String imageUrl1;//菜品图片地址
    private String imageUrl2;//菜品图片地址
    private String imageUrl3;//菜品图片地址
    private String raw_material;//TODO 原材料
    private String note;//菜品介绍
    private long create_time;//创建时间
    private long destory_time;//删除时间

}
