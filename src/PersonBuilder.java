public class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public PersonBuilder() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person build() {
        return new Person(firstName, lastName, age, address);
    }
}
