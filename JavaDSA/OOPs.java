public class OOPs {
    public static void main(String[] args) {

    }
}

class Student {
    String name;
    int roll;
    String password;

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student() {
        System.out.println("Constructor is called");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}