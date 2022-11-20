package com.cloud.sentinel.client;

import com.cloud.sentinel.client.hystrix.ProductFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @description:
 * @author: zhou shuai
 * @date: 2022/1/20 14:32
 * @version: v1
 */
@FeignClient(name = ProductClient.SERVER_NAME,
        path = ProductClient.SERVER_NAME,
        fallbackFactory = ProductFallbackFactory.class)
public interface ProductClient {

    String SERVER_NAME = "product-server";

    /**
     * 购买产品扣减库存
     *
     * @param purchaseProductDTO
     * @return
     */
    @PostMapping(value = "/product/purchase")
    void purchaseProduct(String purchaseProductDTO);

}
