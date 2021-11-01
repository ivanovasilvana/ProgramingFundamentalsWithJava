package ObjectsAndClasses_06.Exc.OrderByAge_07;

public class Person {
    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", name, id, age);
    }
}
