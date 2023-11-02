package com.lozumi.FreshMilkShop;
import java.util.ArrayList;
import java.util.List;

/**
 * 管理产品列表。
 */
public class ProductCatalog {
    private List<Product> products;

    /**
     * 创建一个新的 ProductCatalog 实例，初始化产品列表。
     */
    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    /**
     * 添加产品到产品列表。
     *
     * @param product 要添加的产品
     */
    public void addProduct(Product product) {
        this.products.add(product);
    }

    /**
     * 从产品列表中移除产品。
     *
     * @param product 要移除的产品
     */
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    /**
     * 根据产品代码查找并返回对应的产品。
     *
     * @param code 产品代码
     * @return 匹配的产品
     * @throws Exception 如果未找到产品
     */
    public Product getProduct(String code) throws Exception {
        for (Product product : this.products) {
            if (product.getCode().equals(code)) {
                return product;
            }
        }
        throw new Exception("未找到产品");
    }

    /**
     * 根据索引返回产品信息。
     *
     * @param index 索引
     * @return 产品
     * @throws Exception 如果未找到产品
     */
    public Product getProduct(int index) throws Exception {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        throw new Exception("未找到产品");
    }

    /**
     * 获取产品列表中产品的数量。
     *
     * @return 产品数量
     */
    public int getNumberOfProducts() {
        return products.size();
    }
}
