package demo.test.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author wenxiangmin
 * @ClassName DynamicDataSourceAspect.java
 * @Description 动态数据源切面，作用于自定义@DS注解上
 * @createTime 2022年06月09日 15:36:00
 */
@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DynamicDataSourceAspect {
    private static Logger logger = LoggerFactory.getLogger("DynamicDataSourceAspect");

    @Around(value = "@within(demo.test.config.DS) ||" +
            " @annotation(demo.test.config.DS)")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("joinPoint = " + joinPoint);
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Class<?> aClass = joinPoint.getTarget().getClass();

        DS clzAnno = aClass.getAnnotation(DS.class);
        Method method = signature.getMethod();
        DS methodAnno = method.getAnnotation(DS.class);

        if (null != clzAnno || null != methodAnno) {
            DataSourceEnum value = clzAnno.value();
            if (value != null) {
                DynamicDataSourceHolder.setDataSource(value);
                logger.info("选择数据源>>> {}",value);
            }else {
                DataSourceEnum value2 = methodAnno.value();
                DynamicDataSourceHolder.setDataSource(value2);
                logger.info("选择数据源>>> {}",value2);
            }
        }
        try {
            return joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
