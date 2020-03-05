public class Cat {


    private String name; // "private" создаём инкапуляцию для защиты полей от несанкционированного вмешательства
    private String color;
    private int age;
    // генерируем конструктор
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
// генерируем getter & setter. специалльные методы, позволяющие нам получить доступ к полям наших объектов
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// генерируем toString. Этот метод возвращает нам выбранные поля. Без него попытка вывести созданный объект вывела бы
// только его хэш-код да имя класса
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

