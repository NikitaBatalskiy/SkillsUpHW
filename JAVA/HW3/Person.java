package HW3;

import java.util.Objects;

public class Person {
   private String  name;
   private String lastName;
   private String status;
   private String phoneNumber;

    public Person(String name, String lastName, String status, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.phoneNumber = phoneNumber;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(status, person.status) &&
                Objects.equals(phoneNumber, person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, status, phoneNumber);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status='" + status + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
