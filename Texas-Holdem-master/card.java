
/**
 * Write a description of class card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class card
{
    private int id;
    private String fam;
    private String nr;
    
    public card(String pFam, String pNr, int pId){
        id = pId;
        fam = pFam;
        nr = pNr;
    }
    
    public int getId(){
        return id;   
    }
    
    public String getFam(){
        return fam;
    }
    
    public String getNr(){
        return nr;
    }
}
