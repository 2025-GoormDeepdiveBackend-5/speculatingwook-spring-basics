package org.goorm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
    @Value("${testBean.message}")
    private String message;

    public void sayHello() {
        System.out.println(message);
    }
}
