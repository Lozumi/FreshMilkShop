package com.lozumi.FreshMilkShop;
import java.util.ArrayList;
import java.util.List;

/**
 * 管理以往的订单记录。
 */
public class StoreSales {
    private List<Order> orders;

    /**
     * 创建一个新的 StoreSales 实例，初始化订单列表。
     */
    public StoreSales() {
        this.orders = new ArrayList<>();
    }

    /**
     * 添加订单到订单列表。
     *
     * @param order 要添加的订单
     */
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    /**
     * 从订单列表中移除订单。
     *
     * @param order 要移除的订单
     */
    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    /**
     * 获取以往订单的总数。
     *
     * @return 以往订单的总数
     */
    public int getNumberOfOrders() {
        return this.orders.size();
    }

    /**
     * 根据索引返回指定的以往订单。
     *
     * @param index 索引
     * @return 指定索引位置的以往订单
     */
    public Order getOrder(int index) {
        return orders.get(index);
    }
}
