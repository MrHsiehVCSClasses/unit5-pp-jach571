package u5pp;

/**
 * @author Jacob Cho
 * This class is able to create a card that represents a playing card from a standard 52-card deck. The value and suit of the card 
 * can be changed within this class.
 */
public class Card{
    private String value = "2";
    private String suit = "clubs";

    public Card(){
    }

    /**
     * 
     * @param suit - the suit of the card
     */
    public Card(String suit){
        this.suit = suit;
    }

    /**
     * 
     * @param suit - the suit of the card
     * @param value - the number value of the card or if the card is a royal, then which royal the card is
     */
    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    /**
     * 
     * @return - returns the current value of the card
     */
    public String getValue(){
        return value;
    }

    /**
     * 
     * @return - returns the current suit of the card
     */
    public String getSuit(){
        return suit;
    }

    /**
     * @return - returns the phrase "The <`value`> of <`suit`>"
     */
    public String toString(){
        return "The " + value + " of " + suit;
    }

    /**
     * 
     * @param c - a new Card object called "c"
     * @return - returns true if both the suits and values of the current card and card c have the same value 
     */
    public boolean equals(Card c){
        if(this.suit == c.suit && this.value == c.value){
            return true;
        } else{
            return false;
        }
    }

    /**
     * 
     * @param suit - the suit of the card that the card will change to
     */
    public void changeSuit(String suit){
        if(suit.toLowerCase().equals("clubs") ||
        suit.toLowerCase().equals("diamonds") ||
        suit.toLowerCase().equals("hearts") ||
        suit.toLowerCase().equals("spades")
        ){
            suit = suit.toLowerCase();
            this.suit = suit;
        }
    }

    /**
     * 
     * @param value - the value of the card that the card will change to
     */
    public void changeValue(String value){
        if(value.toLowerCase().equals("2") ||
        value.toLowerCase().equals("3") ||
        value.toLowerCase().equals("4") ||
        value.toLowerCase().equals("5") ||
        value.toLowerCase().equals("6") ||
        value.toLowerCase().equals("7") ||
        value.toLowerCase().equals("8") ||
        value.toLowerCase().equals("9") ||
        value.toLowerCase().equals("10") ||
        value.toLowerCase().equals("jack") ||
        value.toLowerCase().equals("queen") ||
        value.toLowerCase().equals("king") ||
        value.toLowerCase().equals("ace")
        ){
            value = value.toLowerCase();
            this.value = value;
        }
    }
}