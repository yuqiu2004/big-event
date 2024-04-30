package com.itheima.validation;

import com.itheima.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValidation implements ConstraintValidator<State,String> {//两个泛型分别表示 提供给的注解 校验的类型

    /**
     * 提供校验规则
     * @param s 待校验的数据
     * @param constraintValidatorContext
     * @return false表示校验不通过 反之代表通过
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s==null) return false;
        if(s.equals("已发布") || s.equals("草稿")) return true;
        return false;

    }
}
