package com.lozumi.FreshMilkShop;
import java.util.Date;

/**
 * 果冻产品，继承自 Product 类。
 */
public class Jelly extends Product {
    private String flavor;

    /**
     * 构造函数，创建一个新的 Jelly 实例。
     *
     * @param code           产品代码
     * @param description    产品描述
     * @param price          产品价格
     * @param productionDate 生产日期
     * @param freshSpan      保质期
     * @param flavor         果冻口味
     */
    public Jelly(String code, String description, double price, Date productionDate, String freshSpan, String flavor) {
        super(code, description, price, productionDate, freshSpan);
        this.flavor = flavor;
    }

    /**
     * 获取果冻的口味。
     *
     * @return 果冻口味
     */
    public String getFlavor() {
        return flavor;
    }

}
