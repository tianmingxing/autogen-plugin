package com.tianmingxing.autogen.common;

/**
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-16
 */
public class FieldUtil {

    private FieldUtil() {
    }

    /**
     * 根据表名解析成一个规范的类名
     *
     * @param tableName 用下划线分隔的多个英文单词
     * @return 符合类名规范的名称
     */
    public static String parseClassName(String tableName) {
        String[] s = tableName.split("_");
        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            char[] tmp = str.toCharArray();
            if (tmp[0] >= 97) {
                tmp[0] -= 32;
            }
            sb.append(String.valueOf(tmp));
        }
        return sb.toString();
    }

    public static String parseVariableName(String fieldName) {
        String[] s = fieldName.split("_");
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (String str : s) {
            char[] tmp = str.toCharArray();
            if (counter++ == 0) {
                if (tmp[0] >= 65 && tmp[0] <= 90) {
                    tmp[0] += 32;
                }
                sb.append(String.valueOf(tmp));
                continue;
            }

            if (tmp[0] >= 97 && tmp[0] <= 122) {
                tmp[0] -= 32;
            }
            sb.append(String.valueOf(tmp));
        }
        return sb.toString();
    }

    public static String parseSetterName(String fieldName) {
        return "set" + parseClassName(fieldName);
    }

    public static String parseGetterName(String fieldName) {
        return "get" + parseClassName(fieldName);
    }
}
