package com.dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

/**
 * @author 18190
 * @Date: 2021/5/21  10:38
 * @VERSION 1.0
 */
public class BasicDao<T> {
    private static DataSource ds;
    private static QueryRunner runner;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("E:\\Project\\userTomcat\\target\\druid.properties"));
            ds  =DruidDataSourceFactory.createDataSource(properties);
            runner = new QueryRunner(ds);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public  boolean update(String sql,Object... parameters){
        try {

            return runner.update(sql,parameters) > 0;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public List<T> queryMulti(String sql,Class<T> tClass, Object...parameters){
        try {
            return runner.query(sql,new BeanListHandler<>(tClass),parameters);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public  T querySingle(String sql,Class<T> tClass,Object...parameters){
        try {

            return runner.query(sql,new BeanHandler<>(tClass),parameters);

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
