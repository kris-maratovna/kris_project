package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Teacher (String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getName (){
        return name;
    }
    public String getSubject(){
        return subject;
    }

    void evaluate(Student student){
        Random rand = new Random();
        int mark = rand.nextInt(4)+2;
        String grade = "";
        switch(mark){
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
            default:
                break;
            }
                System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                + " по предмету " + subject + " на оценку " + grade);
    }
}
