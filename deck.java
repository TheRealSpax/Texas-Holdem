import java.util.*;
/**
 * Write a description of class deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deck
{
   private List<card> deck = new ArrayList<card>();
   private String[] number = {"2","3","4","5","6","7","8","9","10","B","D","K","A"};
   public deck(){
       int id = 0;
       for(int i=0;i<=3;i++){ // Das cardnspiel wird automatischsortiert gefüllt.
           String tempFam="";
           if(i==0) tempFam="Karo";
           if(i==1) tempFam="Herz";
           if(i==2) tempFam="Pik";
           if(i==3) tempFam="Kreuz";
           for(int j=0;j<number.length;j++){
               deck.add(new card(tempFam, number[j], id));
               id++;
            }
       }
   }
   
  public void sort(){
      boolean sorted = true;
      for(int i = 0;i<deck.size()-1;i++){
          if(deck.get(i).getId() > deck.get(i+1).getId()){
              card temp;
              temp = deck.get(i+1);
              deck.set(i+1, deck.get(i));
              deck.set(i, temp);
              sorted = false;
          }
      }
      if(!sorted){
      sort();
    }
  }
  
  public void shuffle(){
      Collections.shuffle(deck);
  }
  
  public void show(){
    for(int i = 0;i<deck.size();i++){
        System.out.print(i + ": " + deck.get(i).getFam() + " " + deck.get(i).getNr() + ", "); 
    }
    
    System.out.println();
  }
  
  public card getCard(int n){
      return deck.get(n);
  }
  
  public card pullFirstCard(){
      card temp = deck.get(0);
      deck.remove(0);
      return temp;
  }
  
  public void takeHand(List playerHand){
      deck.addAll(playerHand);
  }
}
