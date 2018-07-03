package mapping.test.pro;

import org.springframework.beans.factory.annotation.Value;

public class DevConfig implements IEnvConfig{
	
	@Value("${mail.sendgrid.dev.apikey}")
	String sendgridapikey;
	
	@Value("${mail.sendgrid.dev.username}")
	String sendgridUsername;
	
	@Value("${mail.sendgrid.dev.password}")
	String sendgridpassword;
	
	@Value("${mappingtest.env.dev.profile}")
	String profile;
	
	@Value("${spring.mail.dev.key}")
	String mailkey;
	
	@Override
	public String getSendGridApiKey() {
		// TODO Auto-generated method stub
		return sendgridapikey;
	}

	@Override
	public String getSendGridAccount() {
		// TODO Auto-generated method stub
		return sendgridUsername;
	}

	@Override
	public String getSendGridPassword() {
		// TODO Auto-generated method stub
		return sendgridpassword;
	}
	
	@Override
	public String getActiveProfile(){
		return profile;
	}
	
	@Override
	public String getMailkey() {
		return mailkey;
	}	

}
