/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_nahimhilsaca;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author nahim
 */
public class Lab6P1_NahimHilsaca {

    static Scanner lea = new Scanner(System.in);
    static Random sc=new Random();

    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("Menu");
            System.out.println("1. Cuantos primos tienes?");
            System.out.println("2. Frecuencia de Letras");
            System.out.println("3. Salir");
            opcion = lea.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el tamanio del arreglo a generar: ");
                     int tamanio=lea.nextInt();
                     System.out.println("Ingrese el limite inferior: ");
                     int inferior=lea.nextInt();
                     System.out.println("Ingrese el limite superior: ");
                     int superior=lea.nextInt();
                     
                     while (inferior>superior){
                     
                         System.out.println("Inferior no puede ser mayor a superior");
                         System.out.println("Ingrese el limite inferior: ");
                         inferior=lea.nextInt();
                         System.out.println("Ingrese el limite superior: ");
                          superior=lea.nextInt();
                     
                     }// Validar si inferior es mayor a superior
                     
                     System.out.println("Arreglo Generado: "+getRandArray(tamanio,inferior,superior));
     
                     
                    break;

                case 2:

                    boolean minuscula = false;
                    String palabra;
                    System.out.println("Ingrese una palabra: ");
                    palabra = lea.next();

                    for (int i = 0; i < palabra.length(); i++) {

                        char s = palabra.charAt(i);

                        if (s >= 97 && s <= 122) {

                            minuscula = true;
                            
                            
                        } else if (s >= 65 && s <= 90) {

                            minuscula = false;
                            break;

                        }
                       
                    }// Fin del for del i

                    if (minuscula == false) {

                        System.out.println("Su palabra debe tener solo caracteres en minuscula ");

                    } else if (minuscula == true) {

                        System.out.println("Su palabra es correcta");

                    }
                    
                    if(minuscula==true){
                    
                        System.out.println("Frecuencia de la palabra: "+palabra);
                        
                        System.out.println(extraerFrecuencias(palabra));
                    
                    
                    }// Fin del if 
                    
                    

                    break;

            }// Fin del switch

        }// Fin del while

    }// Fin del metodo main
    public static int[] extraerFrecuencias(String pala){// Pala es el parametro que mide la cadena ingresada por el usuario
    
        
        int acum=0;
    int [] alfabeto= new int[27];
    
    
        for( int j=0; j<pala.length(); j++){
            
          for( int k=0; k<alfabeto.length; k++){
        
            char s=pala.charAt(j);
            
            if( s==97 && s<=122 ){
                
                alfabeto[s-97]++;
                acum++;
            
            }else if(s=='á'|| s=='é'|| s== 'í'||s=='ó'||s=='ú'|| s=='ü') {
            
               alfabeto[26]++;
               acum++;
            }
          }// Fin del for del k      
        }// Fin del for del j
                        
        Imprimir(alfabeto);
            return alfabeto;
                    
    }// Fin del metodo extraerFrecuencias
    
    public static void Imprimir(int[] size ){
    
    for(int i=0; i<size.length; i++){
    
    
        System.out.print(size[i]);
    
    
    }
    
    
    
    
    }// Fin del metodo Imprimir
    
   public static int [] getRandArray(int tam, int sup, int inf ){
    
    int [] entero= new int[tam];
            
       for( int j=0; j<tam; j++){
    
        
        
        entero[j]=inf+ sc.nextInt(sup);
     
    }// Fin del for j
    
    return entero;
    }// Fin del public static getRandAway
    
    public static boolean isPrime(int entero){
    
    boolean primo=false;
    
    
    if( entero%2==0){
    
        primo=true;
    }else{
    
    
    primo=false;
    }
    
    return primo;
    }// Fin del metodo
    
    public static int CountPrimeFactors(int in){
    
    int cont=0;
    
    
          for( int i=0; i<in; i++){
          
          
          
          }
    
    
    
    return cont;
    }// Fin del metodo
    
    public static int[] getTotalPrimeCount(int [] divisor){
        
    int cant=0;
    
    int [] primo=new int[cant];
    
    
    return primo;
    }// Fin del metodo

}// Fin de la clase
