/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek3;

/**
 *
 * @author User
 */
public class MarkahKeseluruhan {
    public static void main(String[]args){
        
        int fop,wp,si;
        int jumlah;
        int purata;
        double peratus;
        
        fop=87;
        coa=90;
        wp=68;
        si=50;
        
        jumlah=fop+coa+wp+si;
        purata=(jumlah)/4;
        peratus=(jumlah*100)/400;
        
        System.out.println("Fundamental of Programming = "+fop+"       Computer Organization and Architecture = "+coa);
        System.out.println("Web Programming = "+wp+"                  System Interface = "+si);
        System.out.println("==================================================================================");
        System.out.println("*                         Jumlah markah: "+jumlah+"                                     *");
        System.out.println("*                         Purata markah: "+purata+"                                      *");
        System.out.println("*                         Peratus markah: "+peratus+"%                                  *");
        System.out.println("==================================================================================");
        
    }
}
