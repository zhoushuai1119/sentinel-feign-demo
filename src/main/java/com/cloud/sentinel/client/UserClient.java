package com.cloud.sentinel.client;

import com.cloud.sentinel.client.hystrix.UserFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @description:
 * @author: zhou shuai
 * @date: 2022/1/20 14:32
 * @version: v1
 */
@FeignClient(name = UserClient.SERVER_NAME,
             path = UserClient.SERVER_NAME,
             fallbackFactory = UserFallbackFactory.class)
public interface UserClient {

    String SERVER_NAME = "user-server";

    @PostMapping(value = "/user/register")
    void userRegister(String userRegisterDTO);

}
