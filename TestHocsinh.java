public class TestHocsinh {
    public static void main(String[] args) {
        //Tao doi tuong de goi ra duoc cac phuong thuc
        Hocsinh student = new Hocsinh();//Sử dụng Constructor trống, nếu không sd nó thì phải truyền value cho nó
        student.setName("Hoanh");
        student.setClasses("C09");
        System.out.println("Ten: " + student.getName());
        System.out.println("Lop: " + student.getClasses());
    }

}
