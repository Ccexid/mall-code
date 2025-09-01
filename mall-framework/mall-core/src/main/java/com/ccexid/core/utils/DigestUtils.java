package com.ccexid.core.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestUtils {

    /**
     * 对输入字符串进行MD5摘要计算
     *
     * @param inputStr 需要进行MD5摘要的输入字符串
     * @return 返回MD5摘要结果的十六进制字符串表示
     */
    public static String digest(String inputStr) {
        if (inputStr == null) {
            inputStr = "";
        }

        try {
            // 获取MD5摘要算法实例
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            // 对输入字符串进行MD5摘要计算
            byte[] digest = md5.digest(inputStr.getBytes(StandardCharsets.UTF_8));
            // 将字节数组转换为十六进制字符串
            StringBuilder hex = new StringBuilder();
            for (byte b : digest) {
                hex.append(String.format("%02x", b & 0xff));
            }
            return hex.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

}
