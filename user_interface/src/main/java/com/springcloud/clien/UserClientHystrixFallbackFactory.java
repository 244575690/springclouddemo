package com.springcloud.clien;

import com.springcloud.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/26 11:53
 * @description：
 */
@Component
public class UserClientHystrixFallbackFactory implements FallbackFactory<UserClien>{
    @Override
    public UserClien create(Throwable throwable) {
        return new UserClien() {
            @Override
            public User getUser(Long id) {
                User user = new User();
                user.setName("出异常了");
                return user;
            }
        };

    }
}
