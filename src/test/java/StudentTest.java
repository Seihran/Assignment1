import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student s;
    private Module m1, m2;
    private CourseProgramme cp1;

    @BeforeEach
    void setUp() throws Exception
    {
        s = new Student("JohnDoe", "06-02-87", 34, 21347030);
        m1 = new Module("EE451", "System on Chip Design I");
        m2 = new Module("EE347", "Embedded Systems Applications Programming");
        cp1 = new CourseProgramme("BP1", new DateTime("2021-01-01T00:00:00Z"),
                new DateTime("2025-01-01T00:00:00Z"));
    }

    @Test
    public void test_username()
    {
        String expected = "JohnDoe34";
        String username = s.getUsername();
        assertEquals(expected, username);
    }
}