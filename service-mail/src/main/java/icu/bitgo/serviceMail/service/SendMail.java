package icu.bitgo.serviceMail.service;

import com.alibaba.fastjson.JSON;
import icu.bitgo.api.mail.pojo.To.MailTransport;
import icu.bitgo.serviceMail.util.SendEmailUtils;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMail {
    private SendEmailUtils sendEmailUtils;

    @Autowired
    public void setSendEmailUtils(SendEmailUtils sendEmailUtils){
        this.sendEmailUtils=sendEmailUtils;
    }

    @RabbitListener(queues = "MailDirectQueue")
    public void Process(String json){
        MailTransport mailTransport = JSON.parseObject(json, MailTransport.class);
        try {
            sendEmailUtils.thymeleafEmail(mailTransport.getTo(), mailTransport.getSubject(), mailTransport.getParams(), mailTransport.getTemplate());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
