package demo.test.config;

import java.lang.annotation.*;

/**
 * @author wenxiangmin
 * @ClassName DS.java
 * @Description TODO
 * @createTime 2022年06月09日 16:30:00
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DS {
    DataSourceEnum value();
}
