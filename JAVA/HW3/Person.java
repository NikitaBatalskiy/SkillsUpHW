package HW3;

import java.util.Objects;

public class Person {
    String  Name;
    String LastName;
    String Status;
    String PhoneNumber;

    public Person(String name, String lastName, String status, String phoneNumber) {
        Name = name;
        LastName = lastName;
        Status = status;
        PhoneNumber = phoneNumber;
    }

    public Person() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(Name, person.Name) &&
                Objects.equals(LastName, person.LastName) &&
                Objects.equals(Status, person.Status) &&
                Objects.equals(PhoneNumber, person.PhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, LastName, Status, PhoneNumber);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Status='" + Status + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
