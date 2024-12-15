    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_ejercicio;

import java.util.Random;
import java.util.Scanner;



    /*public static void main(String[] args) {
        
        int contador = 0;
        while (contador < 5 ){
            System.out.println("contador" + contador);
            contador++; //aumenta
            */
            


public class Clase_ejercicio {
    public static void main(String[] args) {
        Random x = new Random();
        int naleatorio=x.nextInt(6);
        
        System.out.println(naleatorio);
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("ingrese un numero entre 0 y 5");
        numero = entrada.nextInt();
        
        while (naleatorio != numero){   
            //siempre el ciclo va a ser porque es diferente
            System.out.println("Favor ingresar otro numero ");
            numero = entrada.nextInt();
            if (naleatorio > numero ){
                System.out.println("El numero es mayor: ");
            }
            else{
                if (naleatorio == numero);{
                System.out.println("Felicidades, acaba de adivinar el numero!!!!! ");
            }
                else{
                       System.out.println("El numero es menor: ");  
                        
                    
               
              }
                
            }
        
        }     
        
        
        
        
        

   
            

        
    
    }
      
  }
 




