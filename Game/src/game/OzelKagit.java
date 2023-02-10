
package game;


public class OzelKagit extends Kagit {
    protected int kalinlik;

    public OzelKagit() {
        kalinlik=4;
    }

    public OzelKagit(int kalinlik, int nufuz, int dayaniklilik, int seviyePuani) {
        super(nufuz, dayaniklilik, seviyePuani);
        this.kalinlik = kalinlik;
    }

    @Override
    public void nesnePuaniGoster(double dayaniklilik, double seviyePuani) {
        super.nesnePuaniGoster(dayaniklilik, seviyePuani); 
    }

    @Override
    public void etkiHesapla(Nesne a, Nesne b, double oynayan, double rakip) {
        super.etkiHesapla(a, b, oynayan, rakip); 
    }

    

    @Override
    public void durumGuncelle(double a, double b) {
        super.durumGuncelle(a, b); 
    }

    

    public int getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(int kalinlik) {
        this.kalinlik = kalinlik;
    }
    
    
    
    
}
