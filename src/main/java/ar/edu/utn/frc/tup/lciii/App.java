package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Stdin & Stdout!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //System.out.printf("Inserte un Dato Byte: ");
        byte a = scan.nextByte();
       // System.out.printf("El segundo Byte: ");
        byte a2 = scan.nextByte();
       // System.out.printf("El Tercer Byte: ");
        byte a3 = scan.nextByte();

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

    }
}
