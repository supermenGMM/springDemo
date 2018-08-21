package hello;


import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person,Person> {

    @Override
    public Person process(Person item) throws Exception {

        Person person = new Person();
        person.setFirstName(item.getFirstName().toUpperCase());
        person.setLastName(item.getLastName().toUpperCase());
        return person;
    }
}
