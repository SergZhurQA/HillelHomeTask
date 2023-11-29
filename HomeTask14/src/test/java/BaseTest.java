import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    int counter = 1;

    @BeforeClass
    public void beforeClass() {
        System.out.println("Start testing!");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Testing os finished!");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Test number: " + counter + " starts.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Test number: " + counter++ + " is finished.");
    }
}
