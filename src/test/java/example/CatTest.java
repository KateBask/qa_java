package example;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;
    @Mock
    Feline feline;

    @Before
    public void init() {
        cat = new Cat(feline);
    }
    @Test
    public void testGetSoundMeow() {
        Assert.assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void testGetCatToEatMeat() throws Exception {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
    @Test
    public void testGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
    }

