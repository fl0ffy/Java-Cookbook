/**
 * Created by jbernat on 11/17/16.
 */
public class coffee {

    //fields
    private int espressoShots;
    private int sugar;
    private int cream;

    //constructor
    public coffee(int numEspressoShots, int numSugar, int numCream) {
        espressoShots = numEspressoShots;
        sugar = numSugar;
        cream = numCream;
    }

    //default constructor
    public coffee() {
        espressoShots = 1;
        sugar = 0;
        cream = 0;
    }


    //Setter methods
    //setEspressoShots
    public void setEspressoShots(int numEspressoShots) {
        espressoShots = numEspressoShots;
    }

    //setSugar
    public void setSugar(int numSugar) {
        sugar = numSugar;
    }

    //setCream
    public void setCream(int numCream) {
        cream = numCream;
    }

    //Getter methods
    //getEspressoShots
    public int getEspressoShots() {
        return espressoShots;
    }

    //getSugar
    public int getSugar() {
        return sugar;
    }

    //getgream
    public int getCream() {
        return cream;
    }


}
