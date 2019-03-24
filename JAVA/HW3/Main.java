package HW3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John", "Johnson", "Boss", "+3895456555");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println();
        System.out.println(person2.getName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getStatus());
        System.out.println(person2.getPhoneNumber());
        System.out.println();
        person1.setName("Alex");
        person1.setLastName("Alexandrov");
        person1.setStatus("Meneger");
        person1.setPhoneNumber("+38542152515");
        System.out.println(person1.getName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getStatus());
        System.out.println(person1.getPhoneNumber());
    }
}
