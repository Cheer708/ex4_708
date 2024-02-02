/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statelessex4client;


import mybeans.BeanRemote;
import java.util.Scanner;
/**
 *
 * @author AVI03
 */
public class Main {

    @javax.ejb.EJB
    private static BeanRemote bean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter degree Farenheit : ");
        double F = sc.nextDouble();
        System.out.println(F + "Farenheit = " + bean.ftoC(F) + " Celsius");
    }
    
}
