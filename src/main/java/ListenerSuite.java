import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenerSuite implements ISuiteListener {
    public void onStart(ISuite iSuite) {
        System.out.println("Description Suite");
    }

    public void onFinish(ISuite iSuite) {

    }
}
