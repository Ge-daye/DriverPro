package vip.george366.driverpro.utils;

/**
 * @author 葛浩东
 * 一个生成6位验证码的工具类
 */
public class CodeUtil {

    public static String generateCode()
    {
        int code = (int)((Math.random()*9+1)*100000);
        // 转化为字符串
        return ""+code;
    }
}
