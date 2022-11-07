public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //Tao ham Constructor
    Student(int r, String n) {
        rollno = r;
        name = n;

    }

    //Tao phuong thuc thay doi bien static
    static void change() {
        college = "CODEGYM";
    }

    //Tao phuong thuc hien thi gia tri bien
    void display() {
        System.out.println(rollno + "   " + name + "   " + college);
    }
}

