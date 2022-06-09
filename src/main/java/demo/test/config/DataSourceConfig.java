package demo.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author wenxiangmin
 * @ClassName DataSourceConfig.java
 * @Description TODO
 * @createTime 2022年06月09日 10:01:00
 */
@Configuration
public class DataSourceConfig {


    @Bean("testDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.test")
    public DataSource testDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }



    @Bean("test2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.test2")
    public DataSource test2DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
