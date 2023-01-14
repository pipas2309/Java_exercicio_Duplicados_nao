import java.util.Random;

public class FruitBasket {

    private String[] fruits = {
        "Maçâ", "Kiwi", "Pera",
        "Uva", "Salada Mista", "Tangerina",
        "Laranja", "Limão", "Bacate",
        "Bacaxi", "Morango", "Melão",
        "Mamão", "Mirtilo", "Franboesa",
        "Cereja", "Banana", "Caju"
    };
    
    private String[] basket = new String[4];

    //Usado para calcular o indice das frutas
    int MIN = 0;
    int MAX = 17;

    public FruitBasket() {
        for(int i = 0; i < 4; i++) {
            int random = new Random().nextInt(17);
            basket[i] = fruits[random];
        }
    }

    public String[] getBasket() {
        return basket;
    }
    
}
