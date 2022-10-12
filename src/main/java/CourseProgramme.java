import java.util.List;

import org.joda.time.DateTime;

public class CourseProgramme {

    private String courseName;
    private List<String> modules;
    private List<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String courseName, List<String> modules, List<Student> students, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    //	academic start date and end date.
    //	Start and end dates should use Terasoluna Joda Time classes (i.e. DateTime), which



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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
}
