import java.util.List;

public class Lecturer {

    private String name;
    private int age;
    private String dateOfBirth;
    private double id;
    private List<String> modulesTaught;

    public Lecturer(String name, int age, String dateOfBirth, double id, List<String> modulesTaught) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.modulesTaught = modulesTaught;
    }

    public String getUsername() {
        return name + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public List<String> getModulesTaught() {
        return modulesTaught;
    }

    public void setModulesTaught(List<String> modulesTaught) {
        this.modulesTaught = modulesTaught;
    }
}
