public class Person {

    String name;
    Person friend;

    public Person(String name, Person friend) {
        this.name = name;
        this.friend = friend;
    }

   public Person(String name) {
        this.name = name;
        this.friend = null;
    }

    public String getName() {
        return name;
    }

    public Person getFriend() {
        return friend;
    }
}
