package com.lozumi.FreshMilkShop;
import java.util.*;

/**
 * 鲜牛奶商店管理系统核心类，包括产品目录、销售记录和当前订单的管理。
 */
public class BrightFreshMilkSystem {
    private ProductCatalog productCatalog;
    private StoreSales storeSales;
    private Order currentOrder;

    public BrightFreshMilkSystem() {}

    /**
     * 显示产品目录：列出每个产品的代码、描述和生产日期。
     */
    public void displayCatalog() throws Exception {
        int numberOfProducts = productCatalog.getNumberOfProducts();
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(productCatalog.getProduct(i).toString());
        }
    }

    /**
     * 根据产品代码显示产品信息。
     *
     * @param code 产品代码
     * @throws Exception 如果产品不存在
     */
    public void displayProduct(String code) throws Exception {
        System.out.println(productCatalog.getProduct(code).toString());
    }

    /**
     * 显示当前订单的详细信息，包括每个产品的数量、代码、价格和订单总价。
     */
    public void displayOrder() {
        int numberOfItems = currentOrder.getNumberOfItems();
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(currentOrder.getSaleItem(i).toString());
        }
        System.out.println("订单总价：" + currentOrder.getTotalCost());
    }

    /**
     * 将一个产品添加到当前订单。如果产品已经在订单中，则增加其数量。
     *
     * @param product 要添加的产品
     */
    public void addProduct(Product product) {
        if (currentOrder.getSaleItem(product) == null) {
            currentOrder.addSaleItem(new SaleItem(1, product));
        } else {
            currentOrder.getSaleItem(product).setAmount(currentOrder.getSaleItem(product).getAmount() + 1);
        }
    }

    /**
     * 从当前订单中删除一个产品。
     *
     * @param product 要删除的产品
     */
    public void removeProduct(Product product) {
        SaleItem saleItem = currentOrder.getSaleItem(product);
        if (saleItem != null) {
            int currentAmount = saleItem.getAmount();
            if (currentAmount > 1) {
                saleItem.setAmount(currentAmount - 1);
            } else {
                currentOrder.removeSaleItem(saleItem);
            }
        }
    }

    /**
     * 将当前订单添加到商店的销售记录。
     */
    public void addOrder() {
        storeSales.addOrder(currentOrder);
        currentOrder = new Order();
    }

    /**
     * 显示销售记录。
     */
    public void displaySales() {
        int numberOfOrders = storeSales.getNumberOfOrders();
        for (int i = 0; i < numberOfOrders; i++) {
            System.out.printf("第%d单\n", i + 1);
            Order order = storeSales.getOrder(i);
            int numberOfItems = order.getNumberOfItems();
            for (int j = 0; j < numberOfItems; j++) {
                System.out.println(order.getSaleItem(j).toString());
            }
            System.out.println("订单总价：" + order.getTotalCost());
        }
    }
}