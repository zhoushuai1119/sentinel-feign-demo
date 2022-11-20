package com.cloud.sentinel.client.hystrix;

import com.cloud.sentinel.client.UserClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhou shuai
 * @date: 2022/1/20 14:35
 * @version: v1
 */
@Component
public class UserFallbackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable throwable) {
        return new UserClient() {

            @Override
            public void userRegister(String userRegisterDTO) {

            }
        };
    }

}
