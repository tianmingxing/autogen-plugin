package com.tianmingxing.autogen.common;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author tianmingxing <mx.tian@qq.com>
 * @date 2019-10-09
 */
public class FileUtil {

    private FileUtil() {
    }

    public static void write(String content, String path) {
        Path filePath = Paths.get(path);
        try {
            Files.write(filePath, content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
