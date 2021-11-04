import java.util.ArrayList;


public class Student
{
    private String name, dob;
    private int age, id;
    private CourseProgramme crseProg;
    private ArrayList<Module> currModules;

    public Student(String name, String dob, int age, int id)
    {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.id = id;
        currModules = new ArrayList<>();
    }

    public String getUsername()
    {
        return name + age;
    }

    public void addModule(Module module)
    {
        if (!currModules.contains(module))
        {
            currModules.add(module);
        }
    }

    public void removeModule(Module module)
    {
        currModules.remove(module);
    }

    public CourseProgramme getCrseProg()
    {
        return crseProg;
    }

    public void setCrseProg(CourseProgramme crseProg)
    {
        this.crseProg = crseProg;
    }

    public String getModuleNames()
    {
        String names = "";
        for (int i=0;i<currModules.size();i++)
        {
            names += currModules.get(i).getId() + "\n";
        }
        return names;
    }

    @Override
    public String toString() {
        return getUsername() + ", " + id + ", " + getCrseProg().getCourseName() + "\n" + getModuleNames() + "\n";
    }
}