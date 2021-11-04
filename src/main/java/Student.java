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
        currModules = new ArrayList<Module>();
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
        if (currModules.contains(module))
        {
            currModules.remove(module);
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CourseProgramme getCrseProg()
    {
        return crseProg;
    }

    public void setCrseProg(CourseProgramme crseProg)
    {
        this.crseProg = crseProg;
    }

    public ArrayList<Module> getCurrModules()
    {
        return currModules;
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