package sql.entity;

import java.io.InputStream;

/**
 * @author lidapeng
 * @description 添加菜品
 * POST_FORM
 * @date 1:18 下午 2020/1/4
 */
public class IntoMenu {
    private String name;//菜品名称
    private int menuType;//所属分类
    private int defaultNub;//默认数量
    private long much;//菜品价格
    private long packMuch;//打包价格
    private InputStream image1;//展示图片1
    private InputStream image2;//展示图片1
    private InputStream image3;//展示图片1
    private String capacity;//规格逗号分割
    private String material;//原料字符串分割
    private String message;//菜品简介
}
