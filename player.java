import java.util.*;
/**
 * Write a description of class player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class player
{
    int pNr;
    deck allCards;
    List<card> hand = new ArrayList<card>();
    private int buyIn;
    
    public player(deck stapel, int pBuyIn){
        allCards = stapel;
        buyIn = pBuyIn;
    }
    
    public List getHand(){
        return hand;
    }
    
    public void pullCard(int times){
        for(int i = 0;i<times;i++){
        hand.add(allCards.pullFirstCard());
    }
    }
    
    public int getBuyIn(){
        return buyIn;
    }
    
    
}
