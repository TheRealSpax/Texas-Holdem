
/**
 * Write a description of class rules here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class game
{
   public player allPlayer[] = new player[4];
   public deck allCards;
   public int minBuyIn;
   public int smallBlind;
   public int bigBlind;
   
   public game(player p1, player p2, player p3, player p4, deck stapel, int pMBI, int pSB, int pBB){
       allPlayer[0] = p1;
       allPlayer[1] = p2;
       allPlayer[2] = p3;
       allPlayer[3] = p4;
       
       allCards = stapel;
       
       minBuyIn = pMBI;
       smallBlind = pSB;
       bigBlind = pBB;
   }
   
   public void startGame(){
       allCards.shuffle();
       
      for(int i = 0;i<allPlayer.length;i++){
           if(allPlayer[i].getBuyIn() < minBuyIn){
               System.out.print("The buy in of one of the players is to low, try again!");
           }
      }
   }
   
   public void givePlayersCards(){
       for(int i = 0;i<allPlayer.length;i++){
           allPlayer[i].pullCard(2);
       }
   }
   
   public void forceBuyIn(){
       
   }
}