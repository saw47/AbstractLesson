public abstract class User {

    protected String name;
    protected int age;
    protected String sex;

    public User (String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    }

    public String getUserName(User user) {
        return name;
    }

}
