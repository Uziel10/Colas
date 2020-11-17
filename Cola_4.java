
package COLAS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class Cola_4 {
    
     Queue <Character> COLA= new LinkedList(); 
     Queue <Character> COLA2= new LinkedList(); 
     
    int j,i;
    int TOPE=1;
    int Tamaño=27;
    char LETRA;
    
    int pilaU[] = new int[27];
    char pilaJ[] = new char[27];
 
    
     public static int Opcion;
   public static Cola_4 llamar= new Cola_4();
    public static MENU llamar2= new MENU();
    
   public static Scanner leer= new Scanner(System.in);
    
    public static void main(String[] args)
     {
          
           do
       {
           
      System.err.print("\n\n\t\tPROGRAMA COLAS 1.4\n\n");
       System.out.print("\n\nMENU\n\n");
       
       System.out.print("\n1-LLENAR");
       System.out.print("\n2-MOSTRAR");
       System.out.print("\n3-AGREFGAR");
       System.out.print("\n4-ELIMINAR");
       System.out.print("\n5-ORDENAR");
        System.out.print("\n6-MENU PRINCIPAL");
       
       System.out.print("\n\nESCOGE UNA OPCION:  ");
       
       
       switch(Opcion=leer.nextInt())
       {
           case 1:
            llamar.Llenar();
            break;
            
           case 2:
              llamar.Mostrar();
              break;
               
           case 3:
           llamar.Agregar();
           break;
           
           case 4:
               
               llamar.Borrar();
         
           break;
               
           case 5:
               llamar.Ordenar();
           
            break;
            
            case 6:
               llamar2.main(args);
           
            break;
       }
     
       }
            while(Opcion!=7);
           }
    
    public void Llenar()
    {

        if(TOPE<27) 
        {
         
         for(int h=TOPE; h<27; h++){                        
                                                     
             pilaU[h]=(int)(Math.random()*26+65);    
             for(int j=TOPE; j<h; j++){
                 if(pilaU[h]==pilaU[j])
                 {                                                           
                     h--;        
                 }
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
    
    public void Mostrar()
    {
        if(TOPE<=1)
        {
             System.out.print("\n\nTU COLA ESTA VACIA...\n\n");
    }
        else
        {
             System.out.print(COLA);
           
        }
    }
    
    
    public void Agregar()
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
    
    public void Ordenar()
    {
        if(TOPE<=1)
           {
               System.out.print("\n\nNO PUEDO ORDENAR DATOS DE UNA COLA VACIA!!!\n");
               
           }
        else
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
    
    public void Borrar()
       {
           if(TOPE<=1)
           {
               System.out.print("\n\nNO PUEDO BORRAR DATOS DE UNA COLA VACIA!!!\n");
               
           }
          else
          {
              TOPE--;
           COLA.remove();
          System.out.print("\n\nEL PRIMER DATO DE LA COLA FUE ELIMINADO...\n\n");
        
                  
                  }
       }
       
}
    


    

