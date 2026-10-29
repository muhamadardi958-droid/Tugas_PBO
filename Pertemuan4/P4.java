
package latihanpbo;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        int pilih;
        Scanner input=new Scanner(System.in);
        do{
        System.out.println("Bergerak maju   :1");
        System.out.println("Bergerak mundur :2");
        System.out.println("Berhenti        :3");
        System.out.println("Exit            :0");
        System.out.print("Pilihan:");
        pilih=input.nextInt();
       
         if(pilih==1){
             s.m=10;
             System.out.println("");
            System.out.println("bergerak maju "+s.m+"KM");
             System.out.println("Objek sepeda United, jarak tempuh "+s.hitung()+"KM");
            } else if(pilih==2){
                s.m=5;
            System.out.println("");
            System.out.println("bergerak mundur "+s.m+"KM");
             System.out.println("Objek sepeda United, jarak tempuh "+s.hitung()+"KM");
            } else if(pilih==3){
             System.out.println("");
            System.out.println("Sepeda berhenti");
             System.out.println("Objek sepeda United, jarak tempuh "+s.hitung()+"KM");
            }else  if(pilih==0){
              System.out.println("");
            System.out.println("keluar program");
            }else{
                System.out.println("tidak ada");
            }
        }while(pilih!=0);        
    }
}
class Sepeda{
    int m,tot=0;
    int hitung(){
        tot+=m;
        return tot;
    }
}
