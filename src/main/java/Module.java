import java.util.ArrayList;

public class Module
{
    private String name, id;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;

    public Module(String id, String name)
    {
        this.name = name;
        this.id = id;
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<CourseProgramme>();
    }

    public void addStudent(Student student)
    {
        if (!students.contains(student))
            students.add(student);
            student.addModule(this);
    }

    public void removeStudent(Student student)
    {
        if (students.contains(student))
        {
            students.remove(student);
            student.removeModule(this);
        }
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

    @Override
    public String toString() {
        return id + " " + name + "\n" + students;
    }
}