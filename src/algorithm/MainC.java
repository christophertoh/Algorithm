/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author Kelvin
 */
public class MainC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArenaGen Ag = new ArenaGen();

        //Robot r = new Robot(Ag);
        //r.explorationMode(Ag);
        int hexStr = Integer.parseInt(Ag.getMDFString());
        String abc = Integer.toHexString(hexStr);
        System.out.print(abc);
    }
}