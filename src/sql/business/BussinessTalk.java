package sql.business;

/**
 * @author lidapeng
 * @description 商家评价 一个商家一个单独的表
 * @date 1:54 下午 2020/1/3
 */
public class BussinessTalk {
    private byte anonymous;//是否匿名
    private long user_id;//评论者ID
    private int point;//星级
    private long create_time;//评论时间
    private String message;//评论内容
    private String imageUrl1;//评论图片地址1
    private String imageUrl2;//评论图片地址2
    private String imageUrl3;//评论图片地址3
    private long order_detail_id;//订单详情ID
    private String bussiness_answer;//商家回复内容
    private long bussiness_answer_time;//商家回复时间

}
