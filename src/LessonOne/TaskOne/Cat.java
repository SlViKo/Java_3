/**
 *
 * Класс для тестирования обмена элементами
 *
 * @author SlViKo(Кобозев Вячеслав)
 * @version date 18/02/2020
 */
package LessonOne.TaskOne;

public class Cat {

    private String Name;
    private int age;

    public Cat(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "LessonOne.TaskOne.Cat{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
