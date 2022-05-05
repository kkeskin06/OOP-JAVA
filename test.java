
import java.util.Scanner;


public class test {
        public static void main(String[] args) {
        
            System.out.println("****Beyblade Programina Hosgeldiniz****");
            System.out.println("cikis icin q ya basiniz ");
            
            Scanner scanner = new Scanner(System.in);
            
            while(true){
                System.out.println("Hangi beyblade'i üretmek istiyorsunuz : ");
                String islem = scanner.nextLine();
                if(islem.equals("q")){
                    System.out.println("Programdan cikiliyor.");
                    break;
                }
                else{
                   BeybladeFabrikasi Fabrika = new BeybladeFabrikasi();
                   Beyblade beyblade =Fabrika.BeybladeUret(islem);
                   
                   if(beyblade == null){
                       System.out.println("lutfen gecerli bir beyblade giriniz : ");
                       
                   }
                   else{
                       beyblade.bilgileriGoster();
                       beyblade.saldir();
                       beyblade.KutsalCanavariOrtayaCikar();
                   }
                }
            }
    }
}
