package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import config.AppConfig;

public class Main {
	public static void main(String[] args) {

//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"))
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

		// by using xml	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmailService emailService = context.getBean(EmailService.class);
		System.out.println(emailService);
		emailService.sendEmail("test@gamil.com", "hello from Pritam");
		
		// by using Java class
		ApplicationContext  context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailService emailService2 = context2.getBean(EmailService.class);
		System.out.println(emailService2);
		emailService2.sendEmail("test1@gamil.com", "hi");
		
	}
}
