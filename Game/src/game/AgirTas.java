
package game;

public class AgirTas extends Tas {
    protected int sicaklik;

    public AgirTas() {
        sicaklik=4;
    }

    public AgirTas(int sicaklik, int dayaniklilik, int seviyePuani, int katilik) {
        super(dayaniklilik, seviyePuani, katilik);
        this.sicaklik = sicaklik;
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

    

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }
    
    
}
