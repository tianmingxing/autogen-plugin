package com.tianmingxing.autogen.parse;

import com.tianmingxing.autogen.common.FieldUtil;

import java.util.List;

/**
 * 定义表结构模型
 *
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class TableSchemaDTO {

    private String tableName;
    private String className;
    private String primaryKeyField;
    private List<Field> fields;

    public static class Field {
        private String name;
        private String variableName;
        private String setterName;
        private String getterName;
        private String type;
        private String desc;
        private Boolean isNull;
        private String defaultValue;

        @Override
        public String toString() {
            return "Field{" +
                    "name='" + name + '\'' +
                    ", variableName='" + variableName + '\'' +
                    ", setterName='" + setterName + '\'' +
                    ", getterName='" + getterName + '\'' +
                    ", type='" + type + '\'' +
                    ", desc='" + desc + '\'' +
                    ", isNull=" + isNull +
                    ", defaultValue='" + defaultValue + '\'' +
                    '}';
        }

        public String getVariableName() {
            return variableName;
        }

        public void setVariableName(String variableName) {
            this.variableName = variableName;
        }

        public String getSetterName() {
            return setterName;
        }

        public void setSetterName(String setterName) {
            this.setterName = setterName;
        }

        public String getGetterName() {
            return getterName;
        }

        public void setGetterName(String getterName) {
            this.getterName = getterName;
        }

        public String getDefaultValue() {
            return defaultValue;
        }

        public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
            setVariableName(FieldUtil.parseVariableName(name));
            setSetterName(FieldUtil.parseSetterName(name));
            setGetterName(FieldUtil.parseGetterName(name));
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
        setClassName(FieldUtil.parseClassName(tableName));
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
                ", className='" + className + '\'' +
                ", primaryKeyField='" + primaryKeyField + '\'' +
                ", fields=" + fields +
                '}';
    }
}
