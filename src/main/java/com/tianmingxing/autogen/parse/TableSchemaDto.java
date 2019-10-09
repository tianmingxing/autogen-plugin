package com.tianmingxing.autogen.parse;

import java.util.List;

/**
 * 定义表结构模型
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class TableSchemaDto {

    private String tableName;
    private String primaryKeyField;
    private List<Field> fields;

    static class Field {
        private String name;
        private Class<?> type;
        private String desc;
        private Boolean isNull;
        private String defaultValue;

        @Override
        public String toString() {
            return "Field{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    ", desc='" + desc + '\'' +
                    ", isNull=" + isNull +
                    ", defaultValue='" + defaultValue + '\'' +
                    '}';
        }

        public String getDefaultValue() {
            return defaultValue;
        }

        public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
        }

        public Class<?> getType() {
            return type;
        }

        public void setType(Class<?> type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public Boolean getNull() {
            return isNull;
        }

        public void setNull(Boolean aNull) {
            isNull = aNull;
        }

    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPrimaryKeyField() {
        return primaryKeyField;
    }

    public void setPrimaryKeyField(String primaryKeyField) {
        this.primaryKeyField = primaryKeyField;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "TableSchemaDto{" +
                "tableName='" + tableName + '\'' +
                ", primaryKeyField='" + primaryKeyField + '\'' +
                ", fields=" + fields +
                '}';
    }
}
