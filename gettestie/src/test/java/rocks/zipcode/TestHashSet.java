package zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.rocks.zipcode.Person;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHashSet {

    @Test
    public void hashSetInsertionOrderTest() {

        List<Person> list = new ArrayList<>();

        Person p1 = new Person("Edwar", 1245);
        Person p2 = new Person("John", 2344);
        Person p3 = new Person("Ed", 3456);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        Set<Person> hashSet = new HashSet<>();
        hashSet.clear();
        hashSet = new HashSet<>(list);
        String notExpected = list.toString();
        String actual = hashSet.toString();
        Assert.assertNotEquals(notExpected,actual);
    }



}
