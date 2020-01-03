package sql.user;

/**
 * @author lidapeng
 * @description 用户健康表
 * @date 2:37 下午 2020/1/3
 */
public class Healthy {//每日健康数据
    private long user_id;//用户ID
    private int step;//步数
    private int heat;//消耗热量
    private int intake_heat;//摄入热量
    private long time;//记录的时间戳
}
