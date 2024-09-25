package this_reference;

public class Student {
    String name;
    int age;
    double gpa;

    public Student(String name, int age, double gpa) {
        this(name, age);
        this.gpa = gpa;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int foo() {
        return this.age;
    }

    public void compareTo(Student s){
        if (this.gpa < s.gpa){
            System.out.println(this.name + " has gpa lesser than " + s.name);
        }
        else if (this.gpa > gpa) {
            System.out.println(this.name + " has gpa greater than " + s.name);
        }
        else{
            System.out.println("They both have same gpa");
        }
    }

    
}
