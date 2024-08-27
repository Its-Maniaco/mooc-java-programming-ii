import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    ArrayList<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.people.addAll(peopleToAdd);
    }

    public void print() {
        // this.people.forEach(person -> System.out.println(person.toString()));
        // using iterator
        Iterator<Person> person = this.people.iterator();
        while (person.hasNext()) {
            Person currPerson = person.next();
            System.out.println(currPerson.toString());
        }
    }

    public void print(Education education) {
        Iterator<Person> person = this.people.iterator();
        while (person.hasNext()) {
            Person currPerson = person.next();
            if (education == currPerson.getEducation()) {
                System.out.println(currPerson.toString());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> person = this.people.iterator();
        while (person.hasNext()) {
            Person currPerson = person.next();
            if (currPerson.getEducation() == education) {
                // WRONG as it modifies list
                // this.people.remove(currPerson);
                person.remove();

            }
        }
    }
}
