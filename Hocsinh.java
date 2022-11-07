public class Hocsinh {
    private String name = "Hoa";
    private String classes = "C10";


    //Tạo Constructor trống (Nếu không tạo thì khi khai báo đối tượng là đối tượng của class "Hocsinh" thì phải truyền giá trị vào)
    public Hocsinh() {
    }

    //Tao Constructor
    public Hocsinh(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
