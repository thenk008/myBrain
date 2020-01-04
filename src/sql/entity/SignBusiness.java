package sql.entity;

import java.io.InputStream;

/**
 * @author lidapeng
 * @description 入驻食遇外卖
 * POST-FORM
 * @date 10:54 上午 2020/1/4
 */
public class SignBusiness {
    private String name;//店铺名称
    private InputStream logo;//店铺LOGO
    private double x;//餐厅X坐标
    private double y;//餐厅Y坐标
    private String startTime;//开始时间
    private String endTime;//结束时间
    private String restaurant_type;//餐厅类型(1,2,3)
    private String tel;//电话号码
    private String checkCode;//验证码
    private InputStream business_license;//营业执照
    private InputStream licence;//许可证
    private InputStream legal_person_card_top;//法人身份证正面
    private InputStream legal_person_card_bottom;//法人身份证反面
}
