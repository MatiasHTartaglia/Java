/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mensajesencadena;

/**
 *
 * @author Userx
 */
import java.util.*;
public class MensajesEnCadena {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         int n,acum;
         System.out.println("Ingrese la cantidad Inicial de mensajes a enviar");
         n=sc.nextInt();
         cadena(n,0);
        
    }
    
    public static void cadena(int n, int acum){
        acum= acum+n;
        if(n%2==0){
            System.out.print(n+",");
            if(n!=1){
            cadena(n/2,acum);
        }
            
        }else{
            System.out.print(n+",");
            if(n!=1){
            cadena((n*3)+1, acum);
        }
            
        } 
        if(n==1){
        System.out.println("");
        System.out.println("La cantidad total de mensajes enviados fue de :"+acum+" mensajes.");
        }
    }
    
}
