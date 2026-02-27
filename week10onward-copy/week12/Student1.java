package week12;

public class Student1 {
    private String name;
    private String group;
    private String phone;

    public Student1(String name, String group, String phone) {
        this.name = name;
        this.group = group;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
