import org.testng.Assert;
import org.testng.annotations.Test;
import qaauto.task3.RemovingCharacters;

public class RemovingCharactersTest extends BaseTest{

    @Test(groups = "RemovingCharacters method")
    public void removingCharactersPositiveTest() {
        Assert.assertEquals("e", RemovingCharacters.removingCharacters("text", "x", "t"));
    }

    @Test(groups = "RemovingCharacters method")
    public void removingCharactersNullArgsTest() {
        Assert.assertNull(RemovingCharacters.removingCharacters(null, "x", "t"));
    }
}
