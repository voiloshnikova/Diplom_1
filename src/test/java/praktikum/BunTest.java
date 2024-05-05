package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BunTest {

    private static final String BUN_NAME = "Флюоресцентная булка R2-D3";
    private static final float BUN_PRICE = 988F;

    @Test
    public void createBunTest() {
        Bun bun = new Bun(BUN_NAME, BUN_PRICE);
        Assert.assertEquals(BUN_NAME, bun.name);
        Assert.assertEquals(BUN_PRICE, bun.price, 0.0F);
    }
    @Test
    public void getBunNameTest() {
        Bun bun = new Bun(BUN_NAME, BUN_PRICE);
        Assert.assertEquals(BUN_NAME, bun.getName());
    }
    @Test
    public void getBunPriceTest() {
        Bun bun = new Bun(BUN_NAME, BUN_PRICE);
        Assert.assertEquals(BUN_PRICE, bun.getPrice(), 0.0F);
    }
}