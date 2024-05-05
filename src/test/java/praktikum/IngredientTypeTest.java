package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.EnumSet;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    IngredientType ingredientType;

    public IngredientTypeTest(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {IngredientType.SAUCE},
                {IngredientType.FILLING},
        };
    }

    @Test
    public void ingredientTypeContainsCorrectIngredients() {
        assertTrue(EnumSet.allOf(IngredientType.class).contains(ingredientType));
    }
}
