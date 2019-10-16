package com.tianmingxing.autogen.service;

/**
 * 保存数据库连接信息
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public class DataSourceDTO {

    /**
     * localhost:3306/test
     */
    private String url;
    private String username;
    private String password;

    public DataSourceDTO() {
    }

    public DataSourceDTO(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSourceDTO{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
