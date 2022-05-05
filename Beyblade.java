
public class Beyblade {
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    /**
     * @return the beybladeci
     */
    public String getBeybladeci() {
        return beybladeci;
    }

    /**
     * @param beybladeci the beybladeci to set
     */
    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    /**
     * @return the donusHizi
     */
    public int getDonusHizi() {
        return donusHizi;
    }

    /**
     * @param donusHizi the donusHizi to set
     */
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    /**
     * @return the saldiriGucu
     */
    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    /**
     * @param saldiriGucu the saldiriGucu to set
     */
    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    
    public void saldir(){
        System.out.println(getBeybladeci()+" "+saldiriGucu+"ve"+donusHizi+"ile saldiriyor..");
    }
    public void KutsalCanavariOrtayaCikar(){
        System.out.println("bu beyblade'in kutsal canavari bulunmamaktadir.");
    }
    public void bilgileriGoster(){
        System.out.println("beyblade'in adi"+getBeybladeci());
        System.out.println("beyblade'in dönüs hizi "+donusHizi);
        System.out.println("beyblade'in saldiri gücü "+saldiriGucu);
        
    }
}
