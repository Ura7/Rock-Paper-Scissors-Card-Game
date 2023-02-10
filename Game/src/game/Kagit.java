
package game;


public class Kagit extends Nesne {
    protected double nufuz;
    public String kagit_resim = "/resim_oyun/kagitresmi.png";
   public Kagit(){
       nufuz=2;
   }    

    public Kagit(int nufuz, int dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
        this.nufuz = nufuz;
    }

    @Override
    public void durumGuncelle(double a, double b) {
        super.durumGuncelle(a, b); 
    }

    @Override
    public void etkiHesapla(Nesne a,Nesne b, double oynayan, double rakip) {
        super.etkiHesapla(a,b, oynayan, rakip); 
    }

    

    

    

    

    @Override
    public void nesnePuaniGoster(double dayaniklilik, double seviyePuani) {
        super.nesnePuaniGoster(dayaniklilik, seviyePuani); 
    }

    public double getNufuz() {
        return nufuz;
    }

    public void setNufuz(int nufuz) {
        this.nufuz = nufuz;
    }

    
    
    
   
   
}
