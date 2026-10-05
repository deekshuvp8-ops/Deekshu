public class Person {
    private String name; // Private variable (data hiding)

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice"); // Controlled write
        System.out.println(p.getName()); // Controlled read
    }
}

