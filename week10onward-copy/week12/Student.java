


package week12;

public class Student {
    private String name;
    private String phone;
    private String group;

    public Student(String name, String group, String phone) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
