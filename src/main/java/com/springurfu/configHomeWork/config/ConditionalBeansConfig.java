package com.springurfu.configHomeWork.config;

import com.springurfu.configHomeWork.beans.TestBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.*;

@Configuration
public class ConditionalBeansConfig {

    @Bean("testBeanA")
    @Profile("test")
    public TestBean testBeanA() {
        return new TestBean("Bean A создан (профиль test)");
    }

    @Bean("testBeanB")
    @ConditionalOnBean(name = "testBeanA")
    public TestBean testBeanB() {
        return new TestBean("Bean B создан (так как есть Bean A)");
    }

    @Bean("testBeanC")
    @Conditional(ExampleTestNotDefaultCondition.class)
    public TestBean testBeanC() {
        return new TestBean("Bean C создан (EXAMPLE_TEST != default)");
    }
}
