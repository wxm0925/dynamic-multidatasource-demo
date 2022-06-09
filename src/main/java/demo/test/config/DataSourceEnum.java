package demo.test.config;

/**
 * @author wenxiangmin
 * @ClassName DataSourceEnum.java
 * @Description TODO
 * @createTime 2022年06月09日 15:21:00
 */
public enum DataSourceEnum {
    TEST("testDataSource"),TEST2("test2DataSource");

    private String value;

    DataSourceEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
