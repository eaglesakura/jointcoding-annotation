package com.eaglesakura.jc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 変数出力を行うためのAnnotation
 * <p/>
 * public static final属性である場合、定数フィールドとして出力する
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface JCField {
}
