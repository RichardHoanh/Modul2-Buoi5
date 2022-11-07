public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Doan");
        Student s2 = new Student(222, "Trong");
        Student s3 = new Student(333, "Hoanh");
        s1.display();
        s2.display();
        s3.display();
    }
}
