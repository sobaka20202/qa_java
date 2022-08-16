import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.List;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int numberOfKittens;

    public FelineTest(int numberOfKittens) {
        this.numberOfKittens = numberOfKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensNumber() {
        return new Object[][]{
                {1},
                {10},
        };
    }

    @Test
   public void getFamilyPositive(){
       Feline feline = new Feline();
       Assert.assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void getKittensDifferentParametersPositive(){
        Feline feline = new Feline();
        Assert.assertEquals(numberOfKittens, feline.getKittens(numberOfKittens));

    }

    @Test
    public void eatMeatPositive() throws Exception {
        Feline feline = new Feline();
       Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());

    }

}
