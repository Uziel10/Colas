
package COLAS;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author Uziel
 */
public class Cola_3 {
    
     public static int Tamaño,O,Ta;
     public static int TOPE=0;
     public static int R,R2,R3;
     
      Queue<Integer> COLAa= new LinkedList();
      Queue<Integer> COLAb= new LinkedList();
      Queue<Integer> COLAc= new LinkedList();
      
     public static Cola_3 Llamar = new Cola_3();   
     public static MENU Llamar2 = new MENU();
     
     public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
     System.err.print("\n\n\t\tPROGRAMA COLAS 1.3\n");
        
        System.out.print("\n\nINGRESA EL TAMAÑO DE TUS COLAS:  ");
        Tamaño=leer.nextInt();
    Ta=Tamaño;
        
          do
      {
          
         
      System.out.print("\n\n\tMENU\n");
      System.out.print("\n1-LLENAR COLAS A Y B");
      System.out.print("\n2-MOSTRAR COLAS A Y B");
      System.out.print("\n3-VACIAL COLAS A Y B");
      System.out.print("\n4-UNIR COLAS");    
      System.out.print("\n5-MOSTRAR COLA C");
      System.out.print("\n6-MENU PRINCIPAL");
      System.out.print("\n\nELIJE UNAOPCION:  ");
      
      O=leer.nextInt();
      
      
      
      switch(O)
      {
          case 1:
            Llamar.LLENAR();
              break;
              
          case 2:
            Llamar.MOSTRAR();
              break;
          case 3:
             Llamar.VACIAR();
              break;
              
          case 4:
              Llamar.UNIR();
              break;
              
          case 5:
              Llamar.MOSTRAR_C();
              
              break;  
              
              case 6:
              Llamar2.main(args);
              
              break;  
      }
      
      }
      while(O!=7);
    }
     
     public void LLENAR()
     {
         if(TOPE<Tamaño)
       {
           TOPE=Tamaño;
         System.out.print("\n\nLAS COLAS A Y B SE LLENARON CORRECTAMENTE...\n\n");
          for (int j=0; j <Tamaño; j++) {
               
               R=(int)(Math.random()*99+1);
               COLAa.add(R);
          }
             for (int k=0; k <Tamaño; k++) {
               
               R2=(int)(Math.random()*99+1);
               COLAb.add(R2);
             }
       
       }
       else
       {
            System.out.print("\n\nTUS COLAS YA ESTAN LLENAS!!!\n");
       }
         
     }
     
     public void MOSTRAR()
     {
      if(TOPE<=0)
         {
             System.out.print("\n\nTUS COLAS ESTAN VACIAS!!!\n");  
         
         }
         else
                 
         {         
          
              System.out.print("COLA A: "+COLAa);
               System.out.print("\n");
              System.out.print("COLA B: "+COLAb);
         }
     }
     
     public void VACIAR()
     {
         if(TOPE>0)
         {
         do
         {
             TOPE--;
             COLAa.remove();
             COLAb.remove();
         }
         while(TOPE>0);
         
         
         
         System.out.print("\n\nLISTO!!!, COLAS VACIAS...");
         TOPE=0;
         
         
         }
         
         else
         {
             System.out.print("\n\nNO PUEDO BORRAR UNA COLA VACIA...\n");
         }
         }
         
     
     
     public void UNIR()
     { 
        if(TOPE>0)
        {
     System.out.print("\n\nUNIENDO COLA A Y B...");
     
     do
     {
       
     for (int i = 0; i < Tamaño; i++)      
     { 

     R3=COLAa.peek()+COLAb.peek();
     
     COLAc.add(R3);
     
      COLAa.remove();
      COLAb.remove();
       
     }
          Tamaño--;
       
     }
     while(Tamaño>Ta);
    
     
        
     }
     
     else
     {
         System.out.print("\n\nNO PUEDO UNIR COLAS VACIAS...\n");
     }
}
     public void MOSTRAR_C()
     {
          System.out.print("\n\nMOSTRANDO COLA C:  "+COLAc);
     }
     
}

