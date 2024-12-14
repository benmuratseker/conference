import com.xdlab.repository.ISpeakerRepository;
import com.xdlab.repository.StubSpeakerRepository;
import com.xdlab.service.ISpeakerService;
import com.xdlab.service.SpeakerService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")//as default concept is singleton
    //@Scope(value = "singleton")
    //@Scope(value = BeanDefinition.SCOPE_SINGLETON)
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE) // unique instance per request
    public ISpeakerService getSpeakerService(){
        //SpeakerService service = new SpeakerService(getSpeakerRepository());
        SpeakerService service = new SpeakerService();
        //service.setRepository(getSpeakerRepository());// @Autowired will do this automatically
        return service;
    }

    @Bean(name = "speakerRepository")
    public ISpeakerRepository getSpeakerRepository(){
        return new StubSpeakerRepository();
    }
}
