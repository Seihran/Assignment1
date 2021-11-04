import java.util.ArrayList;
import org.joda.time.DateTime;


public class CourseProgramme
{
    private String courseName;
    private ArrayList<Module> modulesList;
    private ArrayList<Student> studentList;
    private DateTime startDate, endDate;

    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modulesList = new ArrayList<>();
        this.studentList = new ArrayList<>();
    }

    public void addModule(Module module)
    {
        modulesList.add(module);
        for(int i=0;i<module.getStudents().size();i++)
        {
            if(!studentList.contains(module.getStudents().get(i)))
            {
                studentList.add(module.getStudents().get(i));
            }
        }
    }

    public void removeModule(Module module)
    {
        if (modulesList.contains(module))
        {
            modulesList.remove(module);
            for(int i=module.getStudents().size()-1;i>=0;i--)
            {
                for(int j=0;j<modulesList.size();j++)
                {
                    if(!modulesList.get(j).getStudents().contains(module.getStudents().get(i)))
                    {
                        studentList.remove(module.getStudents().get(i));
                    }
                }
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return courseName + ", " + "Start Date = " + startDate + ", " + "End Date = " + endDate + "\n"
                + modulesList + "\n" + studentList;
    }
}