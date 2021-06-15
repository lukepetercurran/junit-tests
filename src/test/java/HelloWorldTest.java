import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testIfHelloWorldWorks(){
        String expected = "Hello, World!";
        String expectedDave = "Hello, Dave!";


        assertEquals(expectedDave, HelloWorld.hello("Dave"));
        assertNotEquals(null, HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello(null));
        assertEquals(expected, HelloWorld.hello());
    }
}
