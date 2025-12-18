
import java.util.ArrayList;

class Course {
    private String code;
    private String title;
    private String description;
    private Instructor instructor;
    private int creditHours;
    private ArrayList students = new ArrayList();

    public Course(String code, String title, String description, int creditHours){
        this.code = code;
        this.title = title;
        this.description = description;
        this.creditHours = creditHours;
    }

    public String getCode(){
        return code;
    }

    public String getTitle(){
        return title;
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public ArrayList getStudents(){
        return students;
    }

    public void displayInfo(){
        System.out.println(code + " - " + title);
        System.out.println(description);
        System.out.println("Instructor: " + (instructor != null ? instructor.getName() : "None"));
        System.out.println("Hours: " + creditHours);
    }

    public String getType(){
        return "General Course";
    }

    public void assignInstructor(Instructor i){
        instructor = i;
    }

    public void addStudent(Student s){
        if (!students.contains(s)) students.add(s);
    }

    public String getSummary(){
        return title + " - " + (instructor != null ? instructor.getName() : "TBA");
    }
}