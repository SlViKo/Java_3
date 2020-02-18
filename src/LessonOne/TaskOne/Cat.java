public class Cat {

    private String Name;
    private int age;

    public Cat(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
