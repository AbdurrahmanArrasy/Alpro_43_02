
package ch03;
import java.util.Scanner;

public class Bagian4 {
    int angka;
    
    public int getVarAngka(){
        return angka;
    }
    public void cetak(){
        if(angka== 2 || angka!=1 && angka%2!=0){
        if(angka== 3 || angka% 3!=0){
            if(angka== 5 || angka% 5!=0){
            if(angka==7 || angka%7!=0){
 System.out.println(angka+ "adalah blangan prima");
                }else{
                        System.out.println(angka+ "tidak bilangan prima");
                }
            }else{
                    System.out.println(angka+ "tidak bilangan prima");
                    }
        }else{
                System.out.println(angka+ "tidak bilangan prima");
                }
    }else{
            System.out.println(angka+ "tidak bilangan prima");
            }
    }
}