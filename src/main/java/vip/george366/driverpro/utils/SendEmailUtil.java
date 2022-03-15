package vip.george366.driverpro.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Random;

/**
 * @author 葛浩东
 * @Date
 * 发送邮件的工具类，基于POP3、STMP
 * 因为这个工具类需要注入框架提供的JavaMailSender对象，所以需要将这个工具类注册到容器中
 */
@Component
public class SendEmailUtil {

    @Autowired
    private  JavaMailSender javaMailSender;


    /**
     * 发送普通的纯文本的邮件
     * @param receiver 发送的目标邮箱
     * @return 返回发送的六位验证码
     *
     */
    public  String sentSimpleCode(String receiver){
        String code = CodeUtil.generateCode();

        //构建普通的邮箱对象
        SimpleMailMessage message = new SimpleMailMessage();
        //设置邮件的主题
        message.setSubject("DriverPro网盘验证码");
        //设置发件人
        message.setFrom("1815550182@qq.com");
        //设置接受者(可变长度参数，多个字符串)
        message.setTo(receiver);
        //设置邮件发送日期
        message.setSentDate(new Date());
        //邮件正文
        message.setText("您的验证码为 : 【 "+code+" 】,注意保护隐私，不要泄露！");
        javaMailSender.send(message);
        return code;
    }

    /**
     * 发送带有html格式个code
     */
    public String sentHtmlCode(String receiver){
        String code = CodeUtil.generateCode();
        // 构建一个邮件对象
        MimeMessage message = javaMailSender.createMimeMessage();
        try {
            message.setSubject("来自 [DriverPro] 的信息");
            MimeMessageHelper messageHelper = new MimeMessageHelper(message,true,"utf-8");
            messageHelper.setFrom("1815550182@qq.com");
            messageHelper.setTo(receiver);
            messageHelper.setSentDate(new Date());
            // 设置邮件的正文, 参数true 代表发送html格式
            messageHelper.setText("您的验证码为 : 【 <span style='color:red'>"+code+"</span> 】,注意保护隐私，不要泄露！",true);
            // 发送邮件
            javaMailSender.send(message);
        } catch (Exception e) {
            System.out.println("邮件发送失败.." + e);
        }
        return code;
    }
}
