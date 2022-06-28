package guru.qa;

public class Human {

    public static String commonName = "Человек";

    private int age = 0; //0
    private int weight;
    private String name; //null
    private Head head;

    public int getAge() {
        if (age >= 0) {
            this.age = age
        };
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Human() {
        this.age = 0;
        this.weight = 0;
        this.name = null;
    }

    public Human(int weight) {
        this.weight = weight;
    }

    public Human(int weight, String name) {
        this.weight = weight
        this.name = name;
    }

    public void sayName() {
    }

    public void sayAge() {
    }

    public void sayWeigth() {
    }

    static class Head {
        static String name = "";
        String nonStaticName;


        public void sayName() {
            System.out.println("Имя: " + name);
        }

        public void sayAge() {
            System.out.println("Возраст: " + age);
        }
    }

    public void sayWeight() {
        System.out.println("Вес: " + weight);
    }
    public void incrementAge()
            this.getClass().getName();
    {age = age + 1;}

    public static void sayClassName() {
        System.out.println(commonName);
        System.out.println(Human.class.getName());
    }
}