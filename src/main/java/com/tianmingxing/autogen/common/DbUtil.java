package com.tianmingxing.autogen.common;

import com.tianmingxing.autogen.service.DataSourceDTO;

import java.sql.*;

/**
 * DB常用操作工具类
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class DbUtil {

    private static final String DB_URL = "jdbc:mysql://%s?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true&serverTimezone=Asia/Shanghai";

    private DbUtil() {
    }

    /**
     * 获取DB连接，每次获取都会创建一个新的连接。
     *
     * @return
     */
    public static Connection getConn(DataSourceDTO dataSourceDTO) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(String.format(DB_URL, dataSourceDTO.getUrl()), dataSourceDTO.getUsername(), dataSourceDTO.getPassword());
            conn.setAutoCommit(true);
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("连接DB出错");
            e.printStackTrace();
        }
        return conn;
    }

    public static String getTableSchema(DataSourceDTO dataSourceDTO, String tableName) {
        return getTableSchema(getConn(dataSourceDTO), tableName);
    }

    public static String getTableSchema(Connection conn, String tableName) {
        String tableSchemaStr = null;

        String sql = "SHOW CREATE TABLE " + tableName;
        PreparedStatement preparedStatement;
        try {
            preparedStatement = conn.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                tableSchemaStr = result.getString(2);
                break;
            }
        } catch (SQLException e) {
            System.err.println("执行SQL出错");
            e.printStackTrace();
        }

        return tableSchemaStr;
    }
}
