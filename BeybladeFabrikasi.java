
public class BeybladeFabrikasi {
    public Beyblade BeybladeUret(String Beyblade_Turu){
        
        if(Beyblade_Turu.equals("Dragon")){
            return new Dragon("Takao", "mavi ejderha","Kutsal Canavarla Konusma", 800, 300);
        }
        
        else if(Beyblade_Turu.equals("Dranza")){
            return new Dranza("Kai","Kirmizi Anka Kusu", 600, 400);
        }
        else if(Beyblade_Turu.equals("Drayga")){
            return new Drayga("Rei","Beyaz Kaplan", 800, 250);
        }
        else if(Beyblade_Turu.equals("Draciel")){
            return new Draciel("Max","Kara Kaplumbaga", 400, 1000);
        }
        else 
            return null ; 
    }
    
    
}
