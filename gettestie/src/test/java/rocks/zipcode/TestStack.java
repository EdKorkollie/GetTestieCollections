package zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void pushTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello Edward");
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void popTest() {
        Stack<String> stack = new Stack<>();
        stack.push("demo");
        stack.push("dem");
        String actual = stack.pop().toString();
        actual += stack.pop();
        actual += stack.pop();
        String expected = "demdemo";
        Assert.assertEquals(expected, actual);
    }
}
