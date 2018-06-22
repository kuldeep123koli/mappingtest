package mapping.test.pro;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;

@Component
public class SendEmail {
	@Autowired
	private  SendGrid sendGrid;

	@Async
	public void send(Collection<String> to, String from, String subject, String body, Collection<String> cc,Collection<String> bcc, List<File> files){		
		
		SendGrid.Email email = new SendGrid.Email();
		if(to !=null ){for (String emailTO : to) {email.addTo(emailTO);}}
		email.setFrom(from);
		email.setSubject(subject);
		email.setHtml(body);
		if(cc != null){for (String ccTO : cc) {	email.addCc(ccTO);}}
		if(bcc != null){for (String bccTO : bcc) {email.addBcc(bccTO);}}
		try {
			if(files != null){for (File file : files) {email.addAttachment(file.getName(), file);}}
			sendGrid.send(email);
			System.out.println("Mail Sent To == {},"+ to);
			System.out.println("Mail Sent FROM == {}"+ from);
			System.out.println("Mail CC == {}"+cc);
			System.out.println("Mail BCC == {}"+bcc);
			System.out.println("With subject == {}"+subject);
			System.out.println("With Body == {}"+ body);
			if(files != null) {for (File file : files) {	System.out.println("Attachment == {}"+file.getName());}}
			else {System.out.println("Attachment == {}"+files);}
		}catch (IOException e1) {
			e1.printStackTrace();
			
		}
		catch (SendGridException e) {
			System.out.println("error ={} "+ e.getMessage());
		}
	}
	
	
}
