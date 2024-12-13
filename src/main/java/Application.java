import com.xdlab.service.ISpeakerService;
import com.xdlab.service.SpeakerService;

public class Application {
    public static void main(String[] args) {

        ISpeakerService service = new SpeakerService();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}