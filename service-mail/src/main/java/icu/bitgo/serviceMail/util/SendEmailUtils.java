package icu.bitgo.serviceMail.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Map;

@Component
public class SendEmailUtils {
	private JavaMailSender javaMailSender;
	private TemplateEngine templateEngine;
	@Value("${spring.mail.username}")
	private String from;
	@Autowired
	public void setJavaMailSender(JavaMailSender javaMailSender){
		this.javaMailSender=javaMailSender;
	}
	@Autowired
	public void setTemplateEngine(TemplateEngine templateEngine){
		this.templateEngine=templateEngine;
	}
	public void thymeleafEmail( String to, String subject, Map<String,String> params, String template) throws MessagingException {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setFrom("1020142782@qq.com");
		mimeMessageHelper.setTo(to);
		mimeMessageHelper.setSubject(subject);
		Context ctx = new Context();
		for(Map.Entry<String, String> param : params.entrySet()){
			ctx.setVariable(param.getKey(), param.getValue());
		}
		String emailText = templateEngine.process(template, ctx);
		mimeMessageHelper.setText(emailText, true);
		javaMailSender.send(mimeMessage);
	}
}
