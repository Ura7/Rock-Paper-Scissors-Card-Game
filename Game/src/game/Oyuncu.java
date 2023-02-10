
package game;

import java.util.ArrayList;


public abstract class Oyuncu {
   protected String oyuncuID;
   protected String oyuncuAdi;
   protected double skor;
   public int a1=0;
   
   ArrayList<Nesne> nesneler = new ArrayList();
  public Oyuncu(){
  }
  
   public Oyuncu(String oyuncuID, String oyuncuAdi, double skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }
   
   public void NesneListesi(Nesne[] nesne){
      
      for(Nesne c : nesne)
      {
      nesneler.add(c);
      System.out.println(nesneler.get(a1)+"");
      a1++;
      }
       
   }
   public double SkorGoster(double skorGoster){
     skor += skorGoster;
       return skor;
   
   }
   public Nesne nesneSec(/*Nesne[] nesne1*/int a2){
   /*for(Nesne d : nesne1)
       {
           if(d!=null)
           {
           System.out.println(d.dayaniklilik+"");
           }
           else{
           System.out.println("Boş");
           }
           
       }*/
        return nesneler.get(a2);
   }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public double getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
   
   
   
}
