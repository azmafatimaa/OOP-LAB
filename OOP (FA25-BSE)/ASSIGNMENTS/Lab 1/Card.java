public class Card{
    private final String SUIT;
    private final String RANK;
    private final int VALUE;

    Card(String suit,String rank , int value)
    {
        this.SUIT=suit;
        this.RANK=rank;
        this.VALUE=value;

    }
    public String getSuit(){
        return SUIT;
    }
    public String getRank()
    {
        return RANK;
    }
    public int getValue() {
        return VALUE;
    }

    public String toString()
    {
        return String.format("%s of %s",RANK,SUIT);
    }

}