package test;

public class UserDTO {

    private String id;
    private String pwd;
    private int age;
    private String name;
    private int cash;
    private boolean isLogIn;

    public UserDTO() {
    }

    public UserDTO(String id, String pwd, int age, String name, int cash, boolean isLogIn) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.name = name;
        this.cash = cash;
        this.isLogIn = isLogIn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public boolean isLogIn() {
        return isLogIn;
    }

    public void setLogIn(boolean logIn) {
        isLogIn = logIn;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", cash=" + cash +
                ", isLogIn=" + isLogIn +
                '}';
    }
}
