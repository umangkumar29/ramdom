import java.util.ArrayList;
import java.util.List;

public class statictest {

    public static void main(String[] args) {

        Ingredient vodka = new Ingredient("Vodka", "Clear");
        Ingredient orangeJuice = new Ingredient("Orange Juice", "Orange");
        Ingredient grenadine = new Ingredient("Grenadine", "Red");

        Bartender bartender = new Bartender();

        bartender.addIngredient(vodka);
        bartender.addIngredient(orangeJuice);
        bartender.addIngredient(grenadine);

        Cocktail sunriseCocktail = bartender.mixCocktail("Sunrise Cocktail");

        System.out.println("Cocktail: " + sunriseCocktail);
    }
}

class Bartender {

    private List<Ingredient> availableIngredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        availableIngredients.add(ingredient);
    }

    public Cocktail mixCocktail(String cocktailName) {
        System.out.println("Mixing a " + cocktailName + "...");
        Cocktail cocktail = new Cocktail(cocktailName);

        // Assume a specific recipe for the Sunrise Cocktail
        cocktail.addIngredient(findIngredient("Vodka"));
        cocktail.addIngredient(findIngredient("Orange Juice"));
        cocktail.addIngredient(findIngredient("Grenadine"));

        return cocktail;
    }

    private Ingredient findIngredient(String ingredientName) {
        for (Ingredient ingredient : availableIngredients) {
            if (ingredient.getName().equalsIgnoreCase(ingredientName)) {
                return ingredient;
            }
        }
        return null; // Handle if ingredient is not found
    }
}

class Ingredient {

    private String name;
    private String color;

    public Ingredient(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    // Other methods related to ingredients

    @Override
    public String toString() {
        return "Ingredient [name=" + name + ", color=" + color + "]";
    }
}

class Cocktail {

    private String name;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Cocktail(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    // Other methods related to cocktails

    @Override
    public String toString() {
        return "Cocktail [name=" + name + ", ingredients=" + ingredients + "]";
    }
}
