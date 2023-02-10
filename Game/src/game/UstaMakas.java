
package game;


public class UstaMakas extends Makas{
    protected int hiz;

    public UstaMakas() {
        hiz=4;
    }

    public UstaMakas(int hiz, int keskinlik, int dayaniklilik, int seviyePuani) {
        super(keskinlik, dayaniklilik, seviyePuani);
        this.hiz = hiz;
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

    

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
    
    
    
}
