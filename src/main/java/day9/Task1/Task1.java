package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Михаил", "экономическая группа");
        Teacher teacher1 = new Teacher("Олег Иванович", "Математика");

        System.out.println(student1.getGroupName());
        System.out.println(teacher1.getSubjectName());
        student1.printInfo();
        teacher1.printInfo();
    }
}
