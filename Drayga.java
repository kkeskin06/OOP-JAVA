
public class Drayga extends Beyblade{
    private String KutsalCanavar;

    public Drayga(String KutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.KutsalCanavar = KutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Bu beyblade'in kutsal canavarinin adi : "+KutsalCanavar);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void KutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci()+""+"kutsal canavarini ortaya cikariyor."+KutsalCanavar);
        System.out.println("Bu kutsal canavarin gizli özelligi : Kaplan Pencesi");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saldir() {
        super.saldir(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
