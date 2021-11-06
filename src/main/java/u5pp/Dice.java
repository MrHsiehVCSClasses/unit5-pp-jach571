package u5pp;

/**
 * @author Jacob Cho
 * This class is able to create a dice with any number of sides. It is then able to roll that dice and return the side the dice 
 * landed on. The color of the dice can also be specified.
 */
public class Dice{
    private int numSides = 6;
    private int currentSide = 1;
    private String color = "green";
    
    public Dice(){
    }

    /**
     * 
     * @param numSides - the number of sides a dice has
     */
    public Dice(int numSides){
        this.numSides = numSides;
    }

    /**
     * 
     * @param numSides - the number of sides a dice has
     * @param currentSide - the current side of the dice that is facing up
     */
    public Dice(int numSides, int currentSide){
        this.numSides = numSides;
        changeSide(currentSide);
    }

    /**
     * 
     * @param numSides - the number of sides a dice has
     * @param currentSide - the current side of the dice that is facing up
     * @param color - the color of the dice
     */
    public Dice(int numSides, int currentSide, String color){
        this.numSides = numSides;
        changeSide(currentSide);
        this.color = color;
    }
    
    /**
     * 
     * @return - returns the number of sides that the dice has
     */
    public int getSides(){
        return numSides;
    }
    
    /**
     * 
     * @return - returns the current side of the dice that is facing up
     */
    public int getCurrentSide(){
        return currentSide;
    }

    /**
     * 
     * @return - returns the color of the dice
     */
    public String getColor(){
        return color;
    }

    /**
     * 
     * @return - returns the phrase "The <`color`> <`numSides`>-sided dice is showing <`currentSide`>"
     */
    public String toString(){
        return "The " + color + " " + numSides + "-sided dice is showing " + currentSide;
    }

    /**
     * 
     * @param d - a new Dice object called "d"
     * @return - returns true if the current sides of both the dice and the new dice d are the same side facing up
     */
    public boolean equals(Dice d){
        return this.currentSide == d.currentSide;
    }

    /**
     * 
     * @return - returns a changed number of current side to any number between 1 and the number of sides the dice has (inclusive)
     */
    public int roll(){
        currentSide = (int)(Math.random() * numSides) + 1;
        return currentSide;
    }

    /**
     * 
     * @param num - the number of the side that the dice can change to
     */
    public void changeSide(int num){
        if(num >= 1 && num <= numSides){
            currentSide = num;
        }
    }

    /**
     * 
     * @param color - the color of the dice that the dice will change to
     */
    public void changeColor(String color){
        this.color = color;
    }

    /**
     * 
     * @param num - the number of sides that a dice has or will be changed to
     */
    public void changeNumSides(int num){
        this.numSides = num;
    }
}