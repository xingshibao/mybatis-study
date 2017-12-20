package com.xsb.study.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author shibao.xing
 * @since 2017-12-20 21:06
 */
public class MyDruidDataSourceFactory implements DataSourceFactory {

    private DataSource dataSource;

    @Override
    public void setProperties(Properties properties) {
        try {
            this.dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public DataSource getDataSource() {
        return this.dataSource;
    }
}
