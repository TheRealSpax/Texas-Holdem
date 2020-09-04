public class game
{
   public player allPlayer[] = new player[4];
   public deck allCards;
   public int minBuyIn;
   public int smallBlind;
   public int bigBlind;
   public int potValue;
   
   private boolean sB = false;
   private boolean bB = false;
   private boolean firstCheck = false;
   
  
   
   int a;
   int b;
   
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
   
   public void forceSmallBlind(){
       a= (int)(Math.random()*3);
       
       System.out.println("The small blind is "+smallBlind+"$, the big blind is "+bigBlind+"$.");
       System.out.println("Player "+allPlayer[a].getNr()+"is the small Blind. Please put "+smallBlind+"$ in the pot");
       
   }
   
   public void forceBigBlind(){
       if(sB == true){
       
       b= a+1;
       if(b == 4){
           b = 0;
       }
       System.out.println("Player "+allPlayer[b].getNr()+"is the big Blind. Please put "+bigBlind+"$ in the pot");
       System.out.println(b);
    }else{
       System.out.println("The small Blind is not in the pot. Please force the small Blind and try again");
    }
   }
   
   public void retireSmallBlind(){
       if(bB == true){
           System.out.println("Player "+allPlayer[a].getNr()+" was the small Blind and now he needs to pay "+smallBlind+"$ again");
           
       }else{
           System.out.println("The big Blind is not in the pot. Please force the big Blind and try again");
       }
   }
   
   private void pullFirstCards(){
       card pulledCards[] = new card[3];
       for(int i = 0;i<3;i++){
           pulledCards[i] = allCards.pullFirstCard();
       }
       for(int i = 0;i<3;i++){
           System.out.println(i+". "+pulledCards[i].getFam()+" "+pulledCards[i].getNr());
       }
   }
   
   public void addPot(int blub){
       potValue+=blub;
   }
   
   public void checkPayment(){
       if(potValue == smallBlind){
           System.out.println("The small blind is in. Continue with the big Blind!");
           sB = true;
       }else if(potValue == smallBlind+bigBlind){
           System.out.println("The big blind is in. Player "+allPlayer[(b+1)%4].getNr()+" and Player "+allPlayer[(b+2)%4].getNr()+" now need to pay "+bigBlind+"$!");
           bB = true;
       }else if(potValue == smallBlind+bigBlind*3){
           System.out.println("3 players already put in the big Blind. Use method retireSmallBlind to finish the first Check");
       }else if(potValue == smallBlind*2+bigBlind*3){
           System.out.println("All players payed the first check. The first three cards will now be displayed!");
           firstCheck = true;
           pullFirstCards();
       }
   }
}