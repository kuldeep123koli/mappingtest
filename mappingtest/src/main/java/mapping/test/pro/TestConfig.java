package mapping.test.pro;

import org.springframework.beans.factory.annotation.Value;

public class TestConfig implements IEnvConfig{
	
	@Value("${mail.sendgrid.apikey}")
	String sendgridapikey;
	
	@Value("${mail.sendgrid.username}")
	String sendgridUsername;
	
	@Value("${mail.sendgrid.password}")
	String sendgridpassword;
	
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

}
