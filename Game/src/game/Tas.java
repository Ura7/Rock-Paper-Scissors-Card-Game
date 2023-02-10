
package game;


public  class Tas extends Nesne{
    protected double katilik;
    public String tas_resim = "/resim_oyun/tasresmi.jpg";
    public Tas(){
    katilik =2;
    }
    
    public Tas(double dayaniklilik, double seviyePuani,double katilik){
    super(dayaniklilik,seviyePuani);
    this.katilik = katilik;
    
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

    public double getKatilik() {
        return katilik;
    }

    public void setKatilik(int katilik) {
        this.katilik = katilik;
    }

    public String getTas_resim() {
        return tas_resim;
    }

    public void setTas_resim(String tas_resim) {
        this.tas_resim = tas_resim;
    }
    

    
    
    
}
