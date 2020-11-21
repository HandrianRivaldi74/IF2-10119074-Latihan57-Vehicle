/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan57.vehicle;

/**
 *
 * @author Acer
 * Nama  : HANDRIAN RIVALDI
 * Kelas : PBOIF2
 * NIM   : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle objBicycle = new Bicycle();
        objBicycle.setBrand("Trek Bike");
        objBicycle.setModel("7.4FX");
        objBicycle.setGearCount(23);
        System.out.println("Brand : "+objBicycle.getBrand());
        System.out.println("Model : "+objBicycle.getModel());
        System.out.println("Jumlah Gear : "+objBicycle.getGearCount());
        System.out.println("");

        Skateboard objSkateboard = new Skateboard();
        objSkateboard.setBrand("Ally Skate");
        objSkateboard.setModel("Rocket");
        objSkateboard.setBoardLength(54.5);
        System.out.println("Brand : "+objSkateboard.getBrand());
        System.out.println("Model : "+objSkateboard.getModel());
        System.out.println("Panjangnya Board : "+objSkateboard.getBoardLength());
    }
    
}
