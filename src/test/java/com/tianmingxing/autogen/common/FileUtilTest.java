package com.tianmingxing.autogen.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileUtilTest {

    @Test
    public void write() {
        FileUtil.write("hello", "D:\\test.txt");
    }
}