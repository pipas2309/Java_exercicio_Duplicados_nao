import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        FruitBasket fruitBasketA = new FruitBasket();
        FruitBasket fruitBasketB = new FruitBasket();

        String[] basketA = fruitBasketA.getBasket();
        String[] basketB = fruitBasketB.getBasket();

        String basketAString = Arrays.toString(basketA);
        String basketBString = Arrays.toString(basketB);
        
        String repetedFruits = new String();

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(basketA[i].equals(basketB[j])) repetedFruits += (" " + basketA[i]);
            }
        }

        System.out.println("\nA cesta de frutas A tem: " + basketAString);
        System.out.println("\nA cesta de frutas B tem: " + basketBString);

        System.out.println("\nAs frutas que se repetem, caso existam, são: \"" + repetedFruits + " \".");


    }
}
