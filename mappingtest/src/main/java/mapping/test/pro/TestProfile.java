package mapping.test.pro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class TestProfile {
	@Bean
	public IEnvConfig getTestConfiguration(){
		return new TestConfig();
	}
}

