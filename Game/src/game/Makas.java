
package game;


public class Makas extends Nesne {
    protected int keskinlik;
    public String tas_resim = "/resim_oyun/makasresmi.png";
    public Makas() {
        keskinlik=2;
    }

    public Makas(int keskinlik,int dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
        this.keskinlik=keskinlik;
    }

    @Override
    public void durumGuncelle(double a, double b) {
        super.durumGuncelle(a, b); 
    }

    @Override
    public void etkiHesapla(Nesne a, Nesne b, double oynayan, double rakip) {
        super.etkiHesapla(a, b, oynayan, rakip);
    }

    

    
    

   

    

    @Override
    public void nesnePuaniGoster(double dayaniklilik, double seviyePuani) {
        super.nesnePuaniGoster(dayaniklilik, seviyePuani); 
    }

    public int getKeskinlik() {
        return keskinlik;
    }

    public void setKeskinlik(int keskinlik) {
        this.keskinlik = keskinlik;
    }

    
 }
    

