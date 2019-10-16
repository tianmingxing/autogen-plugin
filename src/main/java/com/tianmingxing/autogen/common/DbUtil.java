package com.tianmingxing.autogen.common;

import java.sql.*;

/**
 * DB常用操作工具类
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class DbUtil {

    private static final String DB_URL = "jdbc:mysql://erp-g2.test.pagoda.com.cn:10030/ms-goods?useUnicode=true&characterEncoding=UTF-8";

    private DbUtil() {
    }

    /**
     * 获取DB连接，每次获取都会创建一个新的连接。
     *
     * @return
     */
    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, "root", "pagoda@test2018");
            conn.setAutoCommit(true);
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("连接DB出错");
            e.printStackTrace();
        }
        return conn;
    }

    public static String getTableSchema(String tableName) {
        return getTableSchema(getConn(), tableName);
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
