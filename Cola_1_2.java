/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COLAS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class Cola_1_2 {
    
    
 public static Cola_1_2 tarea = new Cola_1_2();
 public static MENU tarea2 = new MENU();
 
 public static int TOPE=0;

 int j,i;
char LETRA;
 char pilaJ[] = new char[27];
 int pilaU[] = new  int[27];
   int Tamaño=27;

 public static Scanner leer=new Scanner(System.in);
     Queue <Character> COLA= new LinkedList();  
     

     public static void main(String[] args) {
         
         
         
         int OPC;
         do
         {
             System.err.print("\n\n\t\tPROGRAMA COLAS 1.1 y 1.2\n\n");
             System.out.print("\t\t<<MENU>>");
             System.out.print("\n1-MOSTRAR");
             System.out.print("\n2-BORRAR");
             System.out.print("\n3-LLENAR");
             System.out.print("\n4-AGREGAR");
             System.out.print("\n5-LLENAR ALEATORIAMENTE");
             System.out.print("\n6-ORDENAR");
             System.out.print("\n7-MENU PRINCIPAL");
             
             System.out.print("\n\nSELECCIONA UNA OPCION:  ");
            
         switch(OPC=leer.nextInt())
         {
                 
             case 1:
           tarea.MOSTRAR();
             break;
                 
                 
             case 2:
           TOPE=TOPE-1;
            tarea.BORRAR();
             break;
 
             
             case 3:
             tarea.LLENAR();
             TOPE=27;
             break;
             
              case 4:
             tarea.AGREGAR();
             break;
             
              case 5:
             tarea.LLENAR_ALEATORIO();
               TOPE=27;
             break;
             
              case 6:
                  tarea.ORDENAR();
                   break;
                   
                   case 7:
                  tarea2.main(args);
                   break;
 
            
         }
         
         }
         while(OPC!=8);
         
         tarea.LLENAR();
         
     }
     
     
     public void MOSTRAR()
     {
         
         if(TOPE<=0)
         {
             System.out.print("\n\nTU COLA ESTA VACIA !!!\n");  
         
         }
         else
         {         
          
              System.out.print(COLA);
         }
             }
     
     

       public void LLENAR()     
        {
              if(TOPE<27)
         {
            System.out.print("\n\nTU COLA SE LLENO DE FORMA AUTOMATICA...\n");
                
         for (int T =65; T <= 90-TOPE; T++) {
        
            char DATO= (char) T;
              COLA.offer(DATO);
         }
         
         }
         
              else
              {
                   System.out.print("\n\nTU COLA YA ESTA LLENA!!!\n");  
         
              }
                  
              }

       
       public void BORRAR()
       {
           if(TOPE>0)
           {
           COLA.remove();
           TOPE--;
          System.out.print("\n\nEL PRIMER DATO DE LA COLA FUE ELIMINADO...\n\n");
           }
          else
          {
        System.out.print("\n\nNO PUEDO BORRAR DATOS DE UNA COLA VACIA!!!\n");
                  
                  }
       }
       
       public void AGREGAR()
       {
               
           if(TOPE<27)
           {
               TOPE++;
           System.out.print("\n\nINGRESA EL DATO A LA COLA:  ");
            LETRA=leer.next().charAt(0);
            COLA.offer(LETRA);
           }
           else
           {
               System.out.print("\n\nTU COLA YA ESTA LLENA!!!\n");
           }
       }
       
       public void LLENAR_ALEATORIO()
       {
        if(TOPE<27) 
        {
         for(int h=TOPE; h<27; h++){                        
                                                     
             pilaU[h]=(int)(Math.random()*26+65);    
             for(int j=TOPE; j<h; j++){
                
             }
             
             }  
         for(int z=TOPE; z<27; z++){
         pilaJ[TOPE]= (char) pilaU[z];
         TOPE++;  
         COLA.offer(pilaJ[z]);

         }
          System.out.print(COLA);
         }
        
       else
       {
            System.out.print("\n\nTU COLA YA ESTA LLENA!!!\n");
       }
    }
       public void ORDENAR()
       {
       do
       {
       Tamaño--;
     COLA.remove();
       }while(Tamaño-1>0);
        
        System.out.print("\n\nCOLA ORDENADA CORRECTAMENTE...\n");
        char  auxiliar;
        
       for(int u=1; u<TOPE; u++)
       {
           for(int e=1; e<TOPE-1; e++)
           {
               if(pilaJ[e]>pilaJ[e+1])
               {
                   auxiliar=pilaJ[e];
                   pilaJ[e]=pilaJ[e+1];
                   pilaJ[e+1]=auxiliar;
  
               }
           }
       }
       System.out.print("\n\nCOLA EN ORDEN...\n");
     for(int u=0; u<TOPE; u++)
       {
         COLA.offer(pilaJ[u]);
   } 
     System.out.print("\n\n"+COLA);
          
       }
       }
       
       
 

