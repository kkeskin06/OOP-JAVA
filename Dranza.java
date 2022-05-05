
public class Dranza extends Beyblade{
    private String KutsalCanavar;

    public Dranza(String KutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.KutsalCanavar = KutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Beyblade'in kutsal canavarinin adi: "+KutsalCanavar);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void KutsalCanavariOrtayaCikar() {
        
        System.out.println("Bu beyblade'in kutsal canavari var : "+KutsalCanavar);
        System.out.println("gizli saldirisi : alev kilici");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saldir() {
        super.saldir(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
