package exerciciopessoa;
public class Pessoa {
    private String name;
    private int age;
    private String sex;

    public Pessoa(String name, int age, String sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void have_Birthday(){
        this.setAge(this.getAge() + 1);
    }
    
}
