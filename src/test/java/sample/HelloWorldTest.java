package sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {
    @Test
    public void twice_of_2_is_4() {
        assertThat("Twice of 2 is NOT 4", HelloWorld.twice(2), is(4));
    }
}
