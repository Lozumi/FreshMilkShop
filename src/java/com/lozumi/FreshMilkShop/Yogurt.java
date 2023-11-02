package com.lozumi.FreshMilkShop;

import java.util.Date;

/**
 * 酸奶产品，继承自 Product 类。
 */
public class Yogurt extends Product {
    /**
     * 酸奶类型
     */
    private String type;

    /**
     * 酸奶浓度
     */
    private String diluteConcentration;

    /**
     * 构造函数，创建一个新的 Yogurt 实例。
     *
     * @param code           产品代码
     * @param description    产品描述
     * @param price          产品价格
     * @param productionDate 生产日期
     * @param shelfLife      保质期
     * @param type           酸奶类型
     * @param diluteConcentration 酸奶浓度
     */
    public Yogurt(String code, String description, double price, Date productionDate, String shelfLife, String type, String diluteConcentration) {
        super(code, description, price, productionDate, shelfLife);
        this.type = type;
        this.diluteConcentration = diluteConcentration;
    }

    /**
     * 获取酸奶的类型。
     *
     * @return 酸奶类型
     */
    public String getType() {
        return type;
    }

    /**
     * 获取酸奶的浓度。
     *
     * @return 酸奶浓度
     */
    public String getDiluteConcentration() {
        return diluteConcentration;
    }
}
