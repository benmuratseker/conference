import com.xdlab.repository.ISpeakerRepository;
import com.xdlab.repository.StubSpeakerRepository;
import com.xdlab.service.ISpeakerService;
import com.xdlab.service.SpeakerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    public ISpeakerService getSpeakerService(){
        SpeakerService service = new SpeakerService(getSpeakerRepository());
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public ISpeakerRepository getSpeakerRepository(){
        return new StubSpeakerRepository();
    }
}
