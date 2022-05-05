
public class Dragon extends Beyblade{
    private String KutsalCanavar;
    private String GizliYetenek;

    public Dragon(String KutsalCanavar, String GizliYetenek, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.KutsalCanavar = KutsalCanavar;
        this.GizliYetenek = GizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavar : "+KutsalCanavar);
        System.out.println("Gizli yetenek : "+GizliYetenek);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void KutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci()+""+KutsalCanavar+"'i ortaya cikariyor.");
        System.out.println(getBeybladeci()+"in gizli yetenegi : Hayalet Kasırga");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saldir() {
        super.saldir(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
