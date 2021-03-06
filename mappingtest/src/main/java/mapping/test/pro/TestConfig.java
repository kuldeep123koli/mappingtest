package mapping.test.pro;

import org.springframework.beans.factory.annotation.Value;

public class TestConfig implements IEnvConfig{
	
	@Value("${mail.sendgrid.test.apikey}")
	String sendgridapikey;
	
	@Value("${mail.sendgrid.test.username}")
	String sendgridUsername;
	
	@Value("${mail.sendgrid.test.password}")
	String sendgridpassword;
	
	@Value("${mappingtest.env.test.profile}")
	String profile;
	
	@Value("${spring.mail.test.key}")
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
