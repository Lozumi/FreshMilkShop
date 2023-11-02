package com.lozumi.FreshMilkShop;
import java.util.ArrayList;
import java.util.List;

/**
 * 订单，包含多个销售项。
 */
public class Order {
    private List<SaleItem> saleItems;
    /**
     * 创建一个新的 Order 实例，初始化销售项列表。
     */public Order() {
        this.saleItems = new ArrayList<>();
    }

    /**
     * 向订单中添加销售项。
     *
     * @param saleItem 要添加的销售项
     */
    public void addSaleItem(SaleItem saleItem) {
        this.saleItems.add(saleItem);
    }

    /**
     * 从订单中移除销售项。
     *
     * @param saleItem 要移除的销售项
     */
    public void removeSaleItem(SaleItem saleItem) {
        this.saleItems.remove(saleItem);
    }

    /**
     * 根据产品返回销售项。
     *
     * @param product 产品
     * @return 匹配的销售项，如果不存在则返回 null
     */
    public SaleItem getSaleItem(Product product) {
        for (SaleItem saleItem : this.saleItems) {
            if (saleItem.getProduct() == product) {
                return saleItem;
            }
        }
        return null; // 未找到
    }

    /**
     * 根据索引返回销售项。
     *
     * @param index 销售项索引
     * @return 指定索引位置的销售项
     */
    public SaleItem getSaleItem(int index) {
        return saleItems.get(index);
    }

    /**
     * 获取订单中的销售项数量。
     *
     * @return 订单中的销售项数量
     */
    public int getNumberOfItems() {
        return saleItems.size();
    }

    /**
     * 获取订单的总花费。
     *
     * @return 订单的总花费
     */
    public double getTotalCost() {
        double sum = 0;
        for (SaleItem saleItem : saleItems) {
            sum += saleItem.getTotalPrice();
        }
        return sum;
    }
}
