package com.lozumi.FreshMilkShop;
import java.util.Date;

/**
 * 纯牛奶产品，继承自 Product 类。
 */
public class PureMilk extends Product {
    /**
     * 产地
     */
    private String countryOfOrigin;

    /**
     * 黄油脂含量
     */
    private String butterfat;

    /**
     * 蛋白质含量
     */
    private String protein;

    /**
     * 构造函数，创建一个新的 PureMilk 实例。
     *
     * @param code           产品代码
     * @param description    产品描述
     * @param price          产品价格
     * @param productionDate 生产日期
     * @param shelfLife      保质期
     * @param countryOfOrigin 产品产地
     * @param butterfat      黄油脂含量
     * @param protein        蛋白质含量
     */
    public PureMilk(String code, String description, double price, Date productionDate, String shelfLife, String countryOfOrigin, String butterfat, String protein) {
        super(code, description, price, productionDate, shelfLife);
        this.countryOfOrigin = countryOfOrigin;
        this.butterfat = butterfat;
        this.protein = protein;
    }

    /**
     * 获取产品的产地信息。
     *
     * @return 产品产地
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * 获取产品的黄油脂含量。
     *
     * @return 黄油脂含量
     */
    public String getButterfat() {
        return butterfat;
    }

    /**
     * 获取产品的蛋白质含量。
     *
     * @return 蛋白质含量
     */
    public String getProtein() {
        return protein;
    }
}
