package demo.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wenxiangmin
 * @ClassName DynamicDataSource.java
 * @Description TODO
 * @createTime 2022年06月09日 10:39:00
 */
@Configuration
@Primary
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Autowired
    @Qualifier(value = "testDataSource")
    private DataSource testDataSource;

    @Autowired
    @Qualifier(value = "test2DataSource")
    private DataSource test2DataSource;

    /**
     * 实现父类方法，决定用哪一个dataSource
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        Map<Object,Object> map = new HashMap<>();
        map.put(DataSourceEnum.TEST,testDataSource);
        map.put(DataSourceEnum.TEST2,test2DataSource);
        super.setTargetDataSources(map);

        super.setDefaultTargetDataSource(testDataSource);
        return DynamicDataSourceHolder.getDataSource();
    }

    @Override
    public void afterPropertiesSet() {
        determineCurrentLookupKey();
        super.afterPropertiesSet();
    }
}
