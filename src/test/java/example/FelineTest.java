package example;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FelineTest {
    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithArgs() {
        Assert.assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(feline.eatMeat(), feline.getFood("Хищник"));
    }
}
