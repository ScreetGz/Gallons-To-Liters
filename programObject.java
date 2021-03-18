/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallonsLiters;

import java.util.Scanner;

/**
 *
 * @author 62823
 */
public class programObject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int inputanUser = 0;
        System.out.println("Inputkan nilai Gallons : ");
        inputanUser = scan.nextInt();
        
        Double nilaiGallon = 3.785;
        
        Double hasilAkhir = inputanUser*nilaiGallon;
        System.out.println("Hasil dalam Litter adalah :" +hasilAkhir);
    }
}
