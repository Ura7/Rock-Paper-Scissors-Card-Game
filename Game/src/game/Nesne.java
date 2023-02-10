
package game;


public abstract class Nesne {
    protected double dayaniklilik=20;
    protected double seviyePuani=0;
    public String resim="";
    public double deger=0;
    public double oynayan=0; 
    public double etki =0;
   
   public Nesne(){  
    }
    public Nesne(double dayaniklilik, double seviyePuani){
     this.dayaniklilik = dayaniklilik;
     this.seviyePuani = seviyePuani;
    
    
    }
    public void nesnePuaniGoster(double x, double y){
        System.out.println(this.dayaniklilik +" "+ this.seviyePuani);
    
    
    
    }
    public  void etkiHesapla(Nesne a,Nesne b, double oynayan, double rakip){
      if(a.getClass()==Tas.class && b.getClass()==Kagit.class)  
              {
               etki = oynayan/((0)+(0.8*rakip));
               
              }
      else if(a.getClass()==Tas.class && b.getClass()==Makas.class)  
              {
               etki = (oynayan)/((0.2*rakip)+(0));
               
              }
      else if(a.getClass()==Tas.class && b.getClass()==Tas.class)  
              {
               etki = 0;
               
              }
      if(a.getClass()==Kagit.class && b.getClass()==Kagit.class)  
              {
               etki = 0;
               
              }
      else if(a.getClass()==Kagit.class && b.getClass()==Makas.class)  
              {
               etki = (oynayan)/((0)+(0.8*rakip));
               
              }
      else if(a.getClass()==Kagit.class && b.getClass()==Tas.class)  
              {
               etki = (oynayan)/((0.2*rakip)+(0));
               
              }
      if(a.getClass()==Makas.class && b.getClass()==Kagit.class)  
              {
               etki = (oynayan)/((0.2*rakip)+(0));
               
              }
      else if(a.getClass()==Makas.class && b.getClass()==Makas.class)  
              {
               etki = (0);
               
              }
      else if(a.getClass()==Makas.class && b.getClass()==Tas.class)  
              {
               etki = (oynayan)/((0)+(0.8*rakip));
               
              }
     //etki =  (oynayan)/((0.2*rakip)+(0.8*rakip));
    
    }
    public void durumGuncelle(double a, double b){
    dayaniklilik = a-b;
    
    
    
    }  

    public double getDayaniklilik() {
        return dayaniklilik;
    }

    public void setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    public double getSeviyePuani() {
        return seviyePuani;
    }

    public void setSeviyePuani(double seviyePuani) {
        this.seviyePuani = seviyePuani;
    }
    
    
}
