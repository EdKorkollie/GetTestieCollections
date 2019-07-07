package zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.rocks.zipcode.Person;
import java.util.ArrayList;

public class TestArrayList {

    @Test
    public  void addTest() {
        Person expectedPerson  = new Person("Edward Korkollie", 4444);
        ArrayList<Person> arr = new ArrayList<>();
        int beforeadd = arr.size();
        arr.add(expectedPerson);
        int afterAdd = arr.size();
        Person actualPerson = arr.get(0);
        Assert.assertEquals(expectedPerson, actualPerson);
        Assert.assertEquals(beforeadd +1, afterAdd);


    }

    @Test
    public void removeTest() {
        Person person = new Person("Edward Korkollie", 3445);
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(person);
        int before = arrayList.size();
        arrayList.remove(person);
        int afterRemove = arrayList.size();
        Assert.assertFalse(arrayList.contains(person));
        Assert.assertEquals(before, afterRemove-1);

    }



}
