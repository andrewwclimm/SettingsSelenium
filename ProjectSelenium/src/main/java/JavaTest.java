import org.testng.annotations.Test;

public class JavaTest extends BaseTestClass{

    @Test
    public void myFirstTest() throws InterruptedException {

        Thread.sleep(5000);
    }
}
