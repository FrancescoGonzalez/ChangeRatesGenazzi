import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    // runnare "mvn clean install", oppure selezionando Current File schiacciare play qui
    @Test
    public void test(){
        Main m = new Main();
        assertEquals(m.get1(), 1);
        assertNotEquals(m.get1(), 2);
    }

}
