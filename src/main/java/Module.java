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
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
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

    public String getId()
    {
        return id;
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }

    @Override
    public String toString() {
        return id + ", " + name + "\n";
    }
}