package study.spring.boot.domain;

public class User {
    public User(String name, String age){
        this.setAge(age);
        this.setName(name);
    }
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(String age) {
        try {
            this.age = Integer.parseInt(age);
        } catch(Exception e){
            this.age=-1;
        }
    }
}
