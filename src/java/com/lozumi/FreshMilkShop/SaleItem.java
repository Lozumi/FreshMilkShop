package com.lozumi.FreshMilkShop;

/**
 * 订单中的销售项，包括数量和产品信息。
 */
public class SaleItem {
    private int amount;
    private Product product;

    /**
     * 构造方法，创建一个新的 SaleItem 实例。
     *
     * @param amount 数量
     * @param product  产品
     */
    public SaleItem(int amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    /**
     * 获取销售项对应的产品。
     *
     * @return 产品
     */
    public Product getProduct() {
        return product;
    }

    /**
     * 获取销售项的数量。
     *
     * @return 数量
     */
    public int getAmount() {
        return amount;
    }

    /**
     * 设置销售项的数量。
     *
     * @param newAmount 新数量
     */
    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    /**
     * 获取销售项的总价。
     *
     * @return 总价
     */
    public double getTotalPrice() {
        return amount * product.getPrice();
    }

    /**
     * 重写 toString 方法，以返回销售项的字符串表示形式。
     *
     * @return 销售项的字符串表示
     */
    @Override
    public String toString() {
        return amount + " x " + product.getCode() + " - ￥" + product.getPrice();
    }
}
