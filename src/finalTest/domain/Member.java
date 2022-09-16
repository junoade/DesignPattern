package finalTest.domain;

public class Member {
    private String id;
    private String pwd;
    private String name;
    private String role;

    public Member(String id, String pwd, String name, String role) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.role = role;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
