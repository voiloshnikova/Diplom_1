package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static praktikum.IngredientType.FILLING;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {

    private static final IngredientType INGREDIENT_TYPE = FILLING;
    private static final String INGREDIENT_NAME = "Сырный соус";
    private static final float INGREDIENT_PRICE = 988F;

    @Test
    public void createIngredientTest() {
        Ingredient ingredient = new Ingredient(INGREDIENT_TYPE, INGREDIENT_NAME, INGREDIENT_PRICE);
        Assert.assertEquals(INGREDIENT_TYPE, ingredient.type);
        Assert.assertEquals(INGREDIENT_NAME, ingredient.name);
        Assert.assertEquals(INGREDIENT_PRICE, ingredient.price, 0.0F);
    }

    @Test
    public void getPriceTest() {
        Ingredient ingredient = new Ingredient(INGREDIENT_TYPE, INGREDIENT_NAME, INGREDIENT_PRICE);
        Assert.assertEquals(INGREDIENT_PRICE, ingredient.getPrice(), 0.0F);
    }

    @Test
    public void getNameTest() {
        Ingredient ingredient = new Ingredient(INGREDIENT_TYPE, INGREDIENT_NAME, INGREDIENT_PRICE);
        Assert.assertEquals(INGREDIENT_NAME, ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        Ingredient ingredient = new Ingredient(INGREDIENT_TYPE, INGREDIENT_NAME, INGREDIENT_PRICE);
        Assert.assertEquals(INGREDIENT_TYPE, ingredient.getType());
    }
}
