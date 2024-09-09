
package modell;

import java.util.Arrays;
import java.util.Random;


public class MindentTudoGep {
    private int[] lottoSzelveny;
    private String totoSzelveny;
    private String[] dalok;
    
    static Random rnd = new Random();
        
        
    public MindentTudoGep(){
        this(new String[0]);
    }

    public MindentTudoGep(String dal){
        this(new String[]{dal});
    }

    public MindentTudoGep(String[] dalok){
        this.lottoSzelveny = new int[5];
        this.totoSzelveny = "";
        dallalFeltolt();
        if( !(dalok == null || dalok.length == 0 || dalok[0].isBlank())){
            dalokatFelvesz(dalok);
        }
    }
    
    public void ujraindit(){
        
    }
    
    
    
    public String generalLottoSzelveny(){
        int[] tomb = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int szam = rnd.nextInt(1,100);
            tomb[i] = szam;
        }
        
     

        String nyertes = Arrays.toString(tomb);
        //System.out.println("Lotto nyertes számok: " + nyertes);
        
        
        return nyertes;
    }
    
    
    
    
    
    
    public String generalTotoSzelveny(){
        String toto = "";
        for (int i = 0; i < 13; i++) {
            int alakzat = rnd.next(1,2);
            toto += alakzat;
        }
        
        return "nemtom2";
    }
    
    public String kerDal(){
        return "nemtom3";
    }
    
    public void ujDal(String dal){
        
    }

    private void dallalFeltolt() {
        
    }

    private void dalokatFelvesz(String[] dalok) {
        
    }
}
