import java.util.List;

public class Module {

    private String moduleName;
    private String moduleId;
    private List<Student> students;
    private List<String> courses;
    private double lecturerId;

    public Module(String moduleName, String moduleId, List<Student> students, List<String> courses, double lecturerId) {
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.students = students;
        this.courses = courses;
        this.lecturerId = lecturerId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudentIds(List<Student> students) {
        this.students = students;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public double getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(double lecturerId) {
        this.lecturerId = lecturerId;
    }
}
