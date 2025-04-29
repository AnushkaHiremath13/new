public class Student {
    String name;
    int id;
    String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("course: " + course);
    }

    public static void main(String[] args) {
        Student s = new Student("Anushka", 12345, "Devops");
        s.displayInfo();
    }
    
}
