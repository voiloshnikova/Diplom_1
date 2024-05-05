package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    private Bun bun;
    @Mock
    private Ingredient ingredient;
    private Burger burger;
    private static final String RECEIPT =
            "(==== Вкусная булка ====)\r\n" +
                    "= filling Салат =\r\n" +
                    "(==== Вкусная булка ====)\r\n" +
                    "\r\n" +
                    "Price: 1164,000000\r\n";

    @Before
    public void init() {
        burger = new Burger();
    }

    @Test
    public void setBunsTest() {
        Mockito.when(bun.getName()).thenReturn("Булочка с маком");
        burger.setBuns(bun);
        Assert.assertEquals("Булочка с маком", burger.bun.getName());
    }

    @Test
    public void addIngredientTest() {
        burger.addIngredient(ingredient);
        Assert.assertEquals(List.of(ingredient), burger.ingredients);
    }

    @Test
    public void removeIngredientTest() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals(Collections.EMPTY_LIST, burger.ingredients);
    }

    @Test
    public void moveIngredientTest() {
        burger.addIngredient(ingredient);
        burger.addIngredient(new Ingredient(SAUCE, "Сыр", 768F));
        burger.moveIngredient(0, 1);
        Assert.assertEquals(ingredient, burger.ingredients.get(1));
    }

    @Test
    public void getPriceTest() {
        Mockito.when(bun.getPrice()).thenReturn(554F);
        Mockito.when(ingredient.getPrice()).thenReturn(56F);

        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Assert.assertEquals(1164F, burger.getPrice(), 0.0F);
    }

    @Test
    public void getReceiptTest() {
        Mockito.when(bun.getName()).thenReturn("Вкусная булка");
        Mockito.when(bun.getPrice()).thenReturn(554F);
        Mockito.when(ingredient.getPrice()).thenReturn(56F);
        Mockito.when(ingredient.getName()).thenReturn("Салат");
        Mockito.when(ingredient.getType()).thenReturn(FILLING);

        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Assert.assertEquals(RECEIPT, burger.getReceipt());
    }
}