package demo.test.config;

/**
 * @author wenxiangmin
 * @ClassName DynamicDataSourceHolder.java
 * @Description ThreadLocal对象持有类
 * @createTime 2022年06月09日 15:20:00
 */
public class DynamicDataSourceHolder {
    private static ThreadLocal<DataSourceEnum> threadLocal = new ThreadLocal<>();

    public static DataSourceEnum getDataSource() {
        DataSourceEnum dataSourceEnum = threadLocal.get();
        if (dataSourceEnum == null) {
            threadLocal.set(DataSourceEnum.TEST);
        }
        return threadLocal.get();
    }

    public static void setDataSource(DataSourceEnum dataSourceEnum) {
        threadLocal.set(dataSourceEnum);
    }

    public static void clearContext() {
        threadLocal.remove();
    }
}
