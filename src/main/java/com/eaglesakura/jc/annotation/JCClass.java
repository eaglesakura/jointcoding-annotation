package com.eaglesakura.jc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Parse対象のClassであることを示す
 * <p/>
 * 対象は型、かつ*.classファイルに残す
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface JCClass {

    /**
     * C++出力時に指定するネームスペース
     * <p/>
     * 空白の場合はグローバル空間に出力する
     */
    String cppNamespace() default "";
}
