interface User{
    void setPassword(String password);
    String getPassword();
    void setLogin(String login);
    String getLogin();
    boolean checkPassword(String password);
}

abstract class People implements User{
    public String fio;
    public int age;
    public String jobTitle;
    public String login;
    public String password;

    public People(String fio, int age, String jobTitle) {
        this.fio = fio;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public abstract String getfio();
    public abstract String getjobTitle();
    public abstract void setLogin(String login);
    public abstract String getLogin();
    public abstract void setPassword(String password);
    public abstract String getPassword();
}
class Teacher extends People{
    public Teacher(String fio, int age, String jobTitle) { super(fio, age, jobTitle); }
    public String getfio() { return fio; }
    public String getjobTitle()  { return jobTitle; }
    public void setLogin(String login) { this.login = login; }

    public String getLogin() { return this.login; }
    public void setPassword(String password)  { this.password = password; }

    public String getPassword() { return this.password; }

    public boolean checkPassword(String password) { return this.password.equals(password); }
}
class Student extends People{
    public Student(String fio, int age, String jobTitle) { super(fio, age, jobTitle); }
    public String getfio() { return fio; }
    public String getjobTitle()  { return jobTitle; }
    public void setLogin(String login) { this.login = login; }

    public String getLogin() { return this.login; }
    public void setPassword(String password)  { this.password = password; }

    public String getPassword() { return this.password; }

    public boolean checkPassword(String password) { return this.password.equals(password); }
}
public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов Иван Иванович", 35, "Профессор");
        teacher1.setLogin("teacher1");
        teacher1.setPassword("123456");

        Student student1 = new Student("Петров Петр Петрович", 20, "Студент");
        student1.setLogin("student1");
        student1.setPassword("qwerty");

        System.out.println(teacher1.getfio() + " - " + teacher1.getjobTitle());
        System.out.println(student1.getfio() + " - " + student1.getjobTitle());
    }
}