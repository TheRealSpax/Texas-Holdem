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
    game g;
    /*public boolean p1payed = false;
    public boolean p2payed = false;
    public boolean p3payed = false;
    public boolean p4payed = false;*/
    
    public player(deck stapel, int pBuyIn, int pNr){
        allCards = stapel;
        buyIn = pBuyIn;
        balance = pBuyIn;
        nr = pNr;
    }
    
    public void giveGame(game givenGame){
        g = givenGame;
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
    
    public void setBalance(int amount){
        balance = amount;
    }
    
    public void pay(int amount){
        balance -= amount;
        g.addPot(amount);
        g.checkPayment();
    }
    
    public void getOut(){
        
    }
}
