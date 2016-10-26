package com.eaglesakura.jc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Nativeのインターフェースを出力する
 * <p/>
 * 下記は引数等に置換される
 * <p/>
 * __JC_ALL_ARGMENTS : 全引数
 * __JC_ARG${引数index} : 指定番号の引数 0以上の値
 * __JC_METHODNAME : メソッド名
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface JCMethodSource {

    /**
     * C++用実装を定義する。
     * 複数行にまたがる場合は改行コードを入れる。
     */
    String cppSource() default "";
}
