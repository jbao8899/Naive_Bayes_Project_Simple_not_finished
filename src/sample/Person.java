package sample;

public class Person {
    private int age;
    private String degree;
    private String status;

    public Person() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person(int age, String degree, String setStatus) {
        this.age = age;
        this.degree = degree;
        this.status = setStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
