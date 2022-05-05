
public class Draciel extends Beyblade{
    private String KutsalCanavar;

    public Draciel(String KutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.KutsalCanavar = KutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Bu Beyblade'in Kutsal canavarinin adi : "+KutsalCanavar);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void KutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci()+""+KutsalCanavar+"'ı ortaya cikariyor ");
        System.out.println("Bu beyblade'in kutsal canavarinin gizli özelligi : Kale savunmasi");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saldir() {
        super.saldir(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
