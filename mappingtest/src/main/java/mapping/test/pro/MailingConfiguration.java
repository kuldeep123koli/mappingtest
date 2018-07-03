package mapping.test.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sendgrid.SendGrid;

@Configuration
public class MailingConfiguration {
	
	@Autowired IEnvConfig env;
	
	@Bean
	public SendGrid getMail(){
		System.out.println("active profile : "+env.getActiveProfile());
		System.out.println("username : "+env.getSendGridAccount());
		System.out.println("key : "+env.getMailkey());
		SendGrid mailSender = new SendGrid(env.getSendGridApiKey());
		//SendGrid mailSender1 = new SendGrid(env.getSendGridAccount(),env.getSendGridPassword());
		return mailSender;
	}
	
	/*@Bean 
	public IEnvConfig testConfig(){
		return new TestConfig();
	}*/
	
	/*@Bean IEnvConfig devConfig(){
		return new DevConfig();
	}*/
	
}
