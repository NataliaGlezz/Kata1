package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Natalia", new Date(102,6,18));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
