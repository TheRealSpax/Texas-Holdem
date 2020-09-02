import java.util.*;
/**
 * Write a description of class player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class player
{
    int nr;
    deck allCards;
    List<card> hand = new ArrayList<card>();
    private int buyIn;
    private int balance;
    
    public player(deck stapel, int pBuyIn, int pNr){
        allCards = stapel;
        buyIn = pBuyIn;
        balance = pBuyIn;
        nr = pNr;
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
    
    public int getNr(){
     return nr;   
    }
    
    public int getBalance(){
        return balance;
    }
}
