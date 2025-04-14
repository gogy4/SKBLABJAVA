package com.springurfu.configHomeWork.config;

import lombok.var;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ExampleTestNotDefaultCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        var env = context.getEnvironment();
        var value = env.getProperty("EXAMPLE_TEST");
        return value != null && !value.equalsIgnoreCase("default");
    }
}
