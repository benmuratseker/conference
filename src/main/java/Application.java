import com.xdlab.service.ISpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        //ISpeakerService service = new SpeakerService();

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ISpeakerService service = appContext.getBean("speakerService", ISpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}