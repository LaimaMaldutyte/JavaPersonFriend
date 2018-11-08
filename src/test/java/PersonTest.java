import static org.junit.Assert.*;

public class PersonTest {

    @org.junit.Test
    public void getName() {
        Person person1 = new Person("Jonas");
        assertEquals("Jonas", person1.getName());
    }

    @org.junit.Test
    public void getFriend() {
        Person person1 = new Person("Jonas", null);
        Person person2 = new Person("Petras", person1);
        assertEquals(person1, person2.getFriend());
        assertNull(person1.getFriend());
    }
}