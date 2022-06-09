package demo;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

/**
 * @author wenxiangmin
 * @ClassName Application.java
 * @Description TODO
 * @createTime 2022年06月08日 22:08:00
 */
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@SpringBootApplication
@MapperScan(basePackages = {"demo.test.mapper","demo.test2.mapper"})
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class);
    }
}
