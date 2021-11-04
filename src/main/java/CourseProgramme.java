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
        this.modulesList = new ArrayList<Module>();
        this.studentList = new ArrayList<Student>();
    }

    public void addModule(Module module)
    {
        modulesList.add(module);
        for(int i=0;i<module.getStudents().size();i++)
        {
            studentList.add(module.getStudents().get(i));
        }
    }

    public void removeModule(Module module)
    {
        if (modulesList.contains(module))
        {
            modulesList.remove(module);
            for(int i=module.getStudents().size()-1;i>=0;i--)
            {
                studentList.remove(module.getStudents().get(i));
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModulesList() {
        return modulesList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return courseName + "\n" + modulesList + "\n" + studentList +
                "Start Date = " + startDate +
                "End Date = " + endDate;
    }
}