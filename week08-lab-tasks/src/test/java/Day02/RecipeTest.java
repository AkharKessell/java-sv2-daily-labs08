package Day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RecipeTest {
    Recipe recipe;

    @Test
    void testCreateRecipeOneParameter() {
        recipe = new Recipe("Omlett");
        assertEquals("Omlett", recipe.getName());
        assertNull(recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testCreateRecipeTwoParameters() {
        recipe = new Recipe("Cake", "Best cake ever!");
        assertEquals("Cake", recipe.getName());
        assertEquals("Best cake ever!", recipe.getDescription());
    }

    @Test
    void testAddIngredients() {
        recipe = new Recipe("Omlett");
        recipe.addIngredient("egg");
        recipe.addIngredient("milk", "oil", "salt");
        recipe.addIngredient("pepper", "redpaprika", "cumin");
        List<String> expected = Arrays.asList("egg", "milk", "oil", "salt", "pepper", "redpaprika", "cumin");
        List<String> actual = recipe.getIngredients();
        assertEquals(expected, actual);
    }
}