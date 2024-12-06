import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String getName() {
        return this.name;
    }

    public List<Professor> getProfessors() {
        return this.professors;
    }

    public List<Student> getStudents() {
        return this.students;
    }
}