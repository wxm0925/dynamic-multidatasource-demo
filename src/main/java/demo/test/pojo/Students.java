package demo.test.pojo;

/**
 * @author wenxiangmin
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2022年06月08日 22:16:00
 */
public class Students {
    private Long stuId;
    private String name;
    private String email;
    private String phone;


    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
