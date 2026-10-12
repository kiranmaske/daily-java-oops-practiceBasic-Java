
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kiran", 21);
        Student s2 = new Student("Rahul", 20);

        s1.displayDetails();
        s2.displayDetails();
    }
}
