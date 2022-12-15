
package oyjsezahlenvergleichhaexp;

import java.util.Scanner;


public class OYJSEZahlenVergleichHaExp {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte die Nummer1 eingeben: ");
        int N1 = input.nextInt();
        
        System.out.println("Bitte die Nummer2 eingeben: ");
        int N2 = input.nextInt();
        
        System.out.println("Bitte die Nummer3 eingeben: ");
        int N3 = input.nextInt();
       
        
       if(N1 == N2 && N2 == N3){
           System.out.println("N1 = N2 = N3");
       }else if(N1 == N2 && N2 > N3){
           System.out.println("N1 = N2");
           System.out.println("N3 ist kleiner");
       }else if(N1 == N2 && N2 < N3){
           System.out.println("N1 = N2");
           System.out.println("N3 ist großer");
       }else if(N2 == N3 && N1 > N2){
           System.out.println("N2 = N3");
           System.out.println("N1 ist großer");
       }else if(N2 == N3 && N1 < N2){
           System.out.println("N2 = N3");
           System.out.println("N1 ist kleiner");
       }else if(N3 == N1 && N3 > N2){
           System.out.println("N3 = N1");
           System.out.println("N2 ist kleiner");
       }else if(N3 == N1 && N2 > N3){
           System.out.println("N3 = N1");
           System.out.println("N2 ist großer");
       }else if(N1 > N2 && N1 > N3 && N2 > N3){
           System.out.println("N1 ist großte");
           System.out.println("N3 ist kleiner");
       }else if(N1 > N2 && N1 > N3 && N3 > N2){
           System.out.println("N1 ist großte");
           System.out.println("N2 ist kleinste");
       }else if(N2 > N1 && N2 > N3 && N1 > N3){
           System.out.println("N2 ist großte");
           System.out.println("N3 ist kleinste");
       }else if(N2 > N1 && N2 > N3 && N3 > N1){
           System.out.println("N2 ist großte");
           System.out.println("N1 ist kleinste");
       }else if(N3 > N2 && N3 > N1 && N2 > N1){
           System.out.println("N3 ist großte");
           System.out.println("N1 ist kleinste");
       }else if(N3 > N2 && N3 > N1 && N1 > N2){
            System.out.println("N3 ist großte");
            System.out.println("N2 ist kleinste");
       }else{
           System.out.println("Die Aufgabe ist nicht korrekt");
           
           
           
           
          
           
            
       
       
                   
                   
           
           
       
           
        
    }
               
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
    
    

