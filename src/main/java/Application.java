import com.xdlab.service.ISpeakerService;
import com.xdlab.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        //ISpeakerService service = new SpeakerService();

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ISpeakerService service = appContext.getBean("speakerService", ISpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}