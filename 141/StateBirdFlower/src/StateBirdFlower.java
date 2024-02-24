/** File: StateBirdFlower.java
 * Author: John Bernat
 * Date: 11 Dec 2016
 * Purpose: Create class to create StateBirdFlower
 * objects and methods to return facts about states
 */

//import classes
import java.util.Arrays;

public class StateBirdFlower {

    //Setup state array
    //String[][] stateInfo = new String[50][3];
    /*Info source: http://www.ipl.org/div/stateknow/chart.html
    * pasted in a txt doc named stateinfo.txt and ran the following:
    * awk -F'\t' '{print "{ \""$1"\", \""$4"\", \""$5"\" },"}' stateinfo.txt
    */
    private String[][] stateInfo = new String[][] {
            { "Alabama", "Yellowhammer", "Camellia" },
            { "Alaska", "Willow Ptarmigan", "Forget-me-not" },
            { "Arizona", "Cactus Wren", "Saguaro Cactus Blossom" },
            { "Arkansas", "Mockingbird", "Apple Blossom" },
            { "California", "California Valley Quail", "Golden Poppy" },
            { "Colorado", "Lark Bunting", "Columbine" },
            { "Connecticut", "American Robin", "Mountain Laurel" },
            { "Delaware", "Blue Hen Chicken", "Peach Blossom" },
            { "Florida", "Mockingbird", "Orange Blossom" },
            { "Georgia", "Brown Thrasher", "Cherokee Rose" },
            { "Hawaii", "Nene (Hawaiian Goose)", "Hibiscus" },
            { "Idaho", "Mountain Bluebird", "Syringa" },
            { "Illinois", "Cardinal", "Native violet" },
            { "Indiana", "Cardinal", "Peony" },
            { "Iowa", "Eastern Goldfinch", "Wild Rose" },
            { "Kansas", "Western Meadowlark", "Native Sunflower" },
            { "Kentucky", "Kentucky Cardinal", "Goldenrod" },
            { "Louisiana", "Pelican", "Magnolia" },
            { "Maine", "Chickadee", "White Pine Cone and Tassel" },
            { "Maryland", "Baltimore Oriole", "Black-Eyed Susan" },
            { "Massachusetts", "Chickadee", "Mayflower" },
            { "Michigan", "Robin", "Apple Blossom" },
            { "Minnesota", "Common Loon", "Pink and White Lady's Slipper" },
            { "Mississippi", "Mockingbird", "Magnolia" },
            { "Missouri", "Bluebird", "Hawthorn" },
            { "Montana", "Western Meadowlark", "Bitterroot" },
            { "Nebraska", "Western Meadowlark", "Goldenrod" },
            { "Nevada", "Mountain Bluebird", "Sagebrush" },
            { "New Hampshire", "Purple Finch", "Purple Lilac" },
            { "New Jersey", "Eastern Goldfinch", "Purple Violet" },
            { "New Mexico", "Roadrunner", "Yucca Flower" },
            { "New York", "Bluebird", "Rose" },
            { "North Carolina", "Cardinal", "Dogwood" },
            { "North Dakota", "Western Meadowlark", "Wild Prairie Rose" },
            { "Ohio", "Cardinal", "Scarlet Carnation" },
            { "Oklahoma", "Scissor-Tailed Flycatcher", "Mistletoe" },
            { "Oregon", "Western Meadowlark", "Oregon Grape" },
            { "Pennsylvania", "Ruffed Grouse", "Mountain Laurel" },
            { "Rhode Island", "Rhode Island Red", "Violet" },
            { "South Carolina", "Carolina Wren", "Yellow Jessamine" },
            { "South Dakota", "Ring-Necked Pheasant", "American Pasqueflower" },
            { "Tennessee", "Mockingbird", "Iris" },
            { "Texas", "Mockingbird", "Bluebonnet" },
            { "Utah", "California Gull", "Sego Lily" },
            { "Vermont", "Hermit Thrush", "Red Clover" },
            { "Virginia", "Cardinal", "Dogwood" },
            { "Washington", "Willow Goldfinch", "Western Rhododendron" },
            { "West Virginia", "Cardinal", "Big Rhododendron" },
            { "Wisconsin", "Robin", "Wood Violet" },
            { "Wyoming", "Meadowlark", "Indian Paintbrush" },
            { "Washington, D.C.", "Woodthrush", "American Beauty Rose" },
    };

    // --- Fields ---
    private String bird;
    private String flower;
    private String state;

    // --- Constructors ---
    StateBirdFlower(String state) {
        this.state = state;
        findStateInfo(state);
        this.bird = getBird();
        this.flower = getFlower();
    }

    // --- Setters ---
    //setBird
    public void setBird(String bird) {
        this.bird = bird;
    }
    //setFlower
    public void setFlower(String flower) {
        this.flower = flower;
    }
    //setState
    public void setState(String state) {
        this.state = state;
    }

    // --- Getters ---
    //getBird
    public String getBird() {
        return bird;
    }
    //getFlower
    public String getFlower() {
        return flower;
    }
    //getState
    public String getState() {
        return state;
    }

    // --- Methods ---

    //compare/find state with the outside array
    private void findStateInfo(String stateInput) {
        for (int i = 0; i < 50; i++) {
            if (stateInfo[i][0].equalsIgnoreCase(state)) {
                setBird(stateInfo[i][1]);
                setFlower(stateInfo[i][2]);
                break;
                }
            }
    }

    //toString method
    public String toString() {
        String str = "The state bird for " + getState() + " is the " + getBird() +
                "\nand the state flower for " + getState() + " is the " + getFlower() + ".";
        return str;
    }

}   //end StateBirdFlower
