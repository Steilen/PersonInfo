public class Main {
    private String name;
    private int age;
    private double height;

    public Main(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void printClass() {
        System.out.println("Class about a person");
    }

    public void printObject() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

    public void incAge(int amount) {
        age += amount;
        System.out.println("Age increased by: " + amount);
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
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid data");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void showMessage(String message, int number) {
        System.out.println("Message: " + message + " Number: " + number);
    }

    public static void main(String[] args) {
        printClass();

        Main person1 = new Main("John", 20, 175);
        person1.printObject();
        person1.incAge(3);

        Main person2 = new Main("Anna", 25, 165);
        person2.printObject();
        person2.incAge(2);

        System.out.println("First object name: " + person1.getName());
        person1.setName("Mike");
        System.out.println("Updated first object name: " + person1.getName());

        System.out.println("Second object name: " + person2.getName());
        person2.setName("Alice");
        System.out.println("Updated second object name: " + person2.getName());

        person1.showMessage("Message1");
        person2.showMessage("Message2", 43);
    }
}
