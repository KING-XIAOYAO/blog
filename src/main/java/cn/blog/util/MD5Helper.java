package cn.blog.util;

import java.security.MessageDigest;

/**
 * Created by XIAOYAO on 2016/11/10 9:44.
 * md5加密助手类
 */
public final class MD5Helper {

    /**
     * 生成MD5字符串，32位
     *
     * @param str 需要转换成MD5的字符串
     * @return MD5字符串
     */
    public static String encodeByMD5(String str) {
        String md5Str = "";
        try {
            //创建具有指定算法名称的信息摘要
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            //使用指定的字节数组对摘要进行最后更新，然后完成摘要计算
            byte[] buff = md5.digest(str.getBytes());
            //将得到的字节数组变成字符串返回
            md5Str = bytesToHex(buff);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5Str;
    }

    /**
     * @description 验证输入的密码是正确
     * @param password    加密后的密码
     * @param inputString 输入的字符串
     * @return 验证结果，true：正确 false：错误
     */
    public static boolean validatePassword(String password, String inputString) {
        if (password.equals(encodeByMD5(inputString))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 二进制转十六进制
     *
     * @param bytes 字符数组
     * @return 字符串
     */
    private static String bytesToHex(byte[] bytes) {
        StringBuffer md5Str = new StringBuffer();
        int digital;
        for (int i = 0; i < bytes.length; i++) {
            digital = bytes[i];
            if (digital < 0) {
                digital += 256;
            }
            if (digital < 16) {
                md5Str.append("0");
            }
            md5Str.append(Integer.toHexString(digital));
        }
        return md5Str.toString().toUpperCase();
    }
}
