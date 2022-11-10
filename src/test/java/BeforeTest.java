import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeTest {

    @BeforeClass
    void setup(){
        //driver
        //driver.get();
    }

    @Test
    void testOne(){
        //open webpage
    }
    @Test
    void testTwo(){
        //click buttons
    }
    @Test
    void testThree(){
        //login
    }
    @Test
    void testFour(){
        //logout
    }

    @AfterClass
    void destroy(){
        //driver.quit();
    }
}
