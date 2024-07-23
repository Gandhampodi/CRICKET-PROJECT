package Cricket;

public class Cricketer {
    private int age;
    private String name;
    private int salary;
    private int id;

    public Cricketer(int age, String name, int salary, int id) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Cricketer() {

    }

    public static void remove(Cricketer cricketer) {

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    //public boolean getname() {

        //return false;
    }

