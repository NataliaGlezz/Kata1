package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002,7,18);
        Person person = new Person("Natalia", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
