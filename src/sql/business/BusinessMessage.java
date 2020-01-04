package sql.business;

/**
 * @author lidapeng
 * @description 商家公告及好评
 * @date 1:41 下午 2020/1/3
 */
public class BusinessMessage {
    private long user_id;//主键
    private String message;//公告
    private long create_message;//公告时间
    private long evaluate_nub;//评价次数
    private long evaluate_all_nub;//评价总分数
    private int ranking;//好评数排名

}
