public class Main {
    public static void main(String[] args) {
        PersonBuilder builder1 = new PersonBuilder();
        builder1.setFirstName("Ana");
        builder1.setLastName("Balasa");
        builder1.setAge(26);
        builder1.setAddress("Milano");
        Person persona1 = builder1.build();

        System.out.println("Persona uno: " + persona1);

        PersonBuilder builder2 = new PersonBuilder();
        builder2.setFirstName("Mario");
        builder2.setLastName("Rossi");
        builder2.setAge(30);
        builder2.setAddress("Milano");
        Person persona2 = builder2.build();

        System.out.println("Persona due: " + persona2);

    }
}