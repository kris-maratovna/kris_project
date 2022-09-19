package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Георгий Иванович", "алгебра");
        Student student1 = new Student("Тимофей");
        teacher.evaluate(student1);
    }
}
