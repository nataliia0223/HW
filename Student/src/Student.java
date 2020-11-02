import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    protected String name;
    protected int course;

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    public String getName(){
        return name;
    }

    public int getCourse(){
        return course;
    }

    @Override
    public String toString() {
        return "Student{"
                + "fullName='" + name + '\''
                + ", course=" + course
                + '}';
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator iterator = students.iterator();
        while(iterator.hasNext()) {
            Student student = (Student) (iterator.next());
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String [] args){
        Student student1 = new Student("Koval Nataliia", 3);
        Student student2 = new Student("Danylov Oleh", 4);
        Student student3 = new Student("Kuk Andriana", 2);
        Student student4 = new Student("Loza Andriy", 3);
        Student student5 = new Student("Dah Olha", 2);

        List<Student> studentList = new ArrayList();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println("Students of the 2 course: ");
        Student.printStudents(studentList,2);

        System.out.println("\nSorted by name: ");
        studentList.sort(new NameComparator());
        for(Student student : studentList){
            System.out.println(student);
        }
        System.out.println("\nSorted by course: ");
        studentList.sort(new CourseComparator());
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
