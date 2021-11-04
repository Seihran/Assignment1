import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student s, s1;
    private Module m, m1;
    private CourseProgramme cp;

    @BeforeEach
    void setUp()
    {
        s = new Student("JohnDoe", "06-02-87", 34, 21347030);
        s1 = new Student("JudyDench","04-12-04", 17, 21548733);
        m = new Module("EE451", "System on Chip Design I");
        m1 = new Module("EE347", "Embedded Systems Applications Programming");
        cp = new CourseProgramme("BP1", new DateTime("2021-01-01T00:00:00Z"),
                new DateTime("2025-01-01T00:00:00Z"));
        s.setCrseProg(cp);
        s1.setCrseProg(cp);
    }

    @Test
    public void test_username()
    {
        String expected = "JohnDoe34";
        String username = s.getUsername();
        assertEquals(expected, username);
    }

    @Test
    public void test_addStudents()
    {
        m.addStudent(s);
        cp.addModule(m);
        cp.addModule(m1);
        System.out.println(cp);
    }

    @Test
    public void test_removeModules()
    {
        m.addStudent(s);
        m.addStudent(s1);
        m1.addStudent(s);
        cp.addModule(m);
        cp.addModule(m1);
        System.out.println(cp);
        cp.removeModule(m);
        System.out.println(cp);
    }
}