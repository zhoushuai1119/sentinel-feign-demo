package com.cloud.sentinel.proxy;

import com.cloud.sentinel.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhou shuai
 * @date: 2022/1/20 19:17
 * @version: v1
 */
@Component
public class ProductProxy {

    @Autowired
    private ProductClient productClient;

    /**
     * 购买产品扣减库存
     *
     * @param purchaseProductDTO
     * @return
     */
    public void purchaseProduct(String purchaseProductDTO) {
        productClient.purchaseProduct(purchaseProductDTO);
    }

}
