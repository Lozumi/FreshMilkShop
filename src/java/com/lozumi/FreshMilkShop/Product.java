package com.lozumi.FreshMilkShop;
import java.util.Date;

/**
 * 产品类代表商店中的一种产品，作为鲜奶、果冻、乳饮品、酸奶的父类。
 */
public class Product {
    private String code;
    private String description;
    private double price;
    private Date productionDate;
    private String shelfLife;

    /**
     * 构造函数，创建一个新的 Product 实例。
     *
     * @param code           产品代码
     * @param description    产品描述
     * @param price          产品价格
     * @param productionDate 生产日期
     * @param shelfLife      保质期
     */
    public Product(String code, String description, double price, Date productionDate, String shelfLife) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.productionDate = productionDate;
        this.shelfLife = shelfLife;
    }

    /**
     * 获取产品的唯一代码。
     *
     * @return 产品代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取产品的描述信息。
     *
     * @return 产品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 获取产品的价格。
     *
     * @return 产品价格
     */
    public double getPrice() {
        return price;
    }

    /**
     * 获取产品的生产日期。
     *
     * @return 生产日期
     */
    public Date getProductionDate() {
        return productionDate;
    }

    /**
     * 获取产品的保质期。
     *
     * @return 保质期
     */
    public String getShelfLife() {
        return shelfLife;
    }

    /**
     * 重写 toString 方法，以返回产品信息的字符串表示形式。
     *
     * @return 包含产品代码、描述和生产日期的字符串
     */
    @Override
    public String toString() {
        return code + " - " + description + " (生产日期: " + productionDate + ")";
    }
}
