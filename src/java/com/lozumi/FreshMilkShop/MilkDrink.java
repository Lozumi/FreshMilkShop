package com.lozumi.FreshMilkShop;
import java.util.Date;

/**
 * 乳饮品产品，继承自 Product 类。
 */
public class MilkDrink extends Product {
    private String flavor;
    private String sugar;

    /**
     * 构造函数，创建一个新的 MilkDrink 实例。
     *
     * @param code           产品代码
     * @param description    产品描述
     * @param price          产品价格
     * @param productionDate 生产日期
     * @param shelfLife      保质期
     * @param flavor         乳饮品口味
     * @param sugar          乳饮品糖分含量
     */
    public MilkDrink(String code, String description, double price, Date productionDate, String shelfLife, String flavor, String sugar) {
        super(code, description, price, productionDate, shelfLife);
        this.flavor = flavor;
        this.sugar = sugar;
    }

    /**
     * 获取乳饮品的口味。
     *
     * @return 乳饮品口味
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * 获取乳饮品的糖分含量。
     *
     * @return 乳饮品糖分含量
     */
    public String getSugar() {
        return sugar;
    }
}

