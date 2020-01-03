package sql.business;

/**
 * @author lidapeng
 * @description 商家表
 * @date 9:48 上午 2020/1/3
 */
public class Business {//商家同时也必须是用户
    private long user_id;//用户主键
    private String name;//店铺名称
    private String adress;//餐厅地址
    private double x;//地址X坐标
    private double y;//地址Y坐标
    private long start_time;//开店时间
    private long end_time;//关店时间
    private String restaurant_type;//餐厅分类
    private String tel_nub;//电话号
    private String business_license;//营业执照
    private String licence;//许可证
    private String legal_person_card_top;//法人身份证正面
    private String legal_person_card_bottom;//法人身份证反面
    private String logo;//商家LOGO
    private String science;//店内环境照片(多张拼接字符串)
    private String book;//食遇认证书
}
