package com.cloud.sentinel.client.hystrix;

import com.cloud.sentinel.client.ProductClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhou shuai
 * @date: 2022/1/20 14:35
 * @version: v1
 */
@Component
public class ProductFallbackFactory implements FallbackFactory<ProductClient> {

    @Override
    public ProductClient create(Throwable throwable) {
        return new ProductClient() {

            @Override
            public void purchaseProduct(String purchaseProductDTO) {

            }
        };
    }

}
