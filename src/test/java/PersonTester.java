import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTester {

    @Test
    public void testPerson(){
        Person dave = new Person("Dave");
        Person dave2 = new Person("Dave");
        Person daveInAPartyHat = dave;

        assertEquals("Dave", dave.getName());
        assertSame(dave, daveInAPartyHat);
//        assertSame(dave, dave2);
    }

    @Test
    public void arrayTest(){
        int[] arrayOfInts = {1,2,3,4};
        int[] yetMoreInts = {5,6,7,8};

//        assertEquals(arrayOfInts, yetMoreInts);
        assertArrayEquals(arrayOfInts, yetMoreInts);
    }

    @Test
    public void testForCool(){
        Person joeCool = new Person("Joe", true);
        Person instructorDavid = new Person("David", false);

        assertTrue(joeCool.isCool());
        assertTrue("Joe is super cool.", joeCool.isCool());
    }
}
