/**
 * Created by john on 11/17/16.
 */
public class coffeeTest {
    public static void main (String[] args) {

        //Construct a black coffee
        coffee black = new coffee();

        //Construct a lightAndSweet coffee
        coffee lightAndSweet = new coffee(1, 2, 2);

        //Call the getter methods for black
        int blackEspressoShots = black.getEspressoShots();
        int blackSugar = black.getSugar();
        int blackCream = black.getCream();

        //print results for black
        System.out.println("Black coffee has " + blackEspressoShots + " espresso shots.");
        System.out.println("Black coffee has " + blackSugar + " sugars.");
        System.out.println("Black coffee has " + blackCream + " servings of cream.");

        //Call the getter methods for light and sweet
        int lightAndSweetEspressoShots = lightAndSweet.getEspressoShots();
        int lightAndSweetSugar = lightAndSweet.getSugar();
        int lightAndSweetCream = lightAndSweet.getCream();

        //print results for light and sweet
        System.out.println();
        System.out.println("Light and sweet coffee has " + lightAndSweetEspressoShots + " espresso shots.");
        System.out.println("Light and sweet coffee has " + lightAndSweetSugar + " sugars.");
        System.out.println("Light and sweet coffee has " + lightAndSweetCream + " servings of cream.");

        //Unhappy customer
        System.out.println();
        System.out.println("Excuse me, I asked for sugar with my black coffee.");

        //Call the setter methods
        black.setSugar(2);
        //Call getter method to update
        blackSugar = black.getSugar();

        //print results and apology to customer
        System.out.println();
        System.out.println("I'm sorry, here is your coffee.");
        System.out.println("Black coffee has " + blackEspressoShots + " espresso shots.");
        System.out.println("Black coffee has " + blackSugar + " sugars.");
        System.out.println("Black coffee has " + blackCream + " servings of cream.");

    }
}
