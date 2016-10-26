package com.eaglesakura.jc.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 変数出力を行うためのAnnotation
 *
 * 未サポート
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface JCEnum {
}
