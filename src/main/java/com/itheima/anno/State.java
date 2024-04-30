package com.itheima.anno;


import com.itheima.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented//元注解 使可以抽取到帮助文档中
@Target(ElementType.FIELD)//标识可以用到哪里
@Retention(RetentionPolicy.RUNTIME)//元注解 保留到编译阶段
@Constraint(validatedBy = StateValidation.class)//指定提供校验规则的类
public @interface State {
    //提供校验失败后的提示信息
    String message() default "state 值只能为 已发布 | 草稿";
    //指定分组
    Class<?>[] groups() default {};
    //负载 获取到注解的附加信息
    Class<? extends Payload>[] payload() default {};
}
