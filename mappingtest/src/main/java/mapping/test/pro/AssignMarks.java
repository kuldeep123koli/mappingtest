package mapping.test.pro;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AssignMarks {
	/* private static final Logger log = LoggerFactory.getLogger(AssignMarks.class);

	    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	    @Scheduled(fixedRate = 6000)
	    public void reportCurrentTime() {
	        log.info("The time is now1 {}", dateFormat.format(new Date()));
	    }*/
	
	@Scheduled(cron = "${mappingtest.mapping.test.pro.marks}")
	public void getTime(){
		System.out.println("getTime : "+new Date().getTime());
	}
	
}
