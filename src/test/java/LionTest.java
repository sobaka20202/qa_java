import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {



    @Mock
    Feline feline;

    @Test
    public void doesHaveManeMaleTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(true, lion.doesHaveMane());

}

    @Test
    public void doesHaveManeFemaleTrue() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(false, lion.doesHaveMane());

    }

    @Test
    public void  getKittensWithoutParamsOneKitten () throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(0, lion.getKittens());
    }

    @Test
    public void getFoodPredatorPositive() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }
}
