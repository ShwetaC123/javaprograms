package Java;

public class VariablesPractice {
 public void StudentAge(){
    int age = 10;
    age = age + 20;
    System.out.println("Student Age is:" + age);
 }
 public static void main(String[] args) {
    VariablesPractice temp = new VariablesPractice();
    temp.StudentAge();
 }   
}
