import java.util.ArrayList;


public class Module
{
    private String name, id;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;

    public Module(String name, String id)
    {
        this.name = name;
        this.id = id;
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<CourseProgramme>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public ArrayList<CourseProgramme> getCourses()
    {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses)
    {
        this.courses = courses;
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }

    public void setStudents(ArrayList<Student> students)
    {
        this.students = students;
    }

}