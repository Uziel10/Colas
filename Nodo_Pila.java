
package nodos;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class Nodo_Pila {
    public static Scanner leer = new Scanner(System.in);
    public static Scanner leer2 = new Scanner(System.in);
     public static int OPC;
     public static String X;
     
     public static NodoU F = null;

    static class NodoU{
        String D;
        
      
        NodoU sig;
    }

    public static void main(String[] args) {
        
        NodoU objeto = new NodoU();
        
          do
        {
        System.out.print("\t---MENU---\n");
        System.out.print("\t---PILA_NODO---\n");
        System.out.print("\t\t\n1-AGREGAR\n"+
                         "2-MOSTRAR");
        
        System.out.print("\n\nELIGE UNA OPCION: ");
           
        
       
      switch(OPC = leer.nextInt())
      {
          case 1:
              Agregar();
               break;
              
              
              case 2:
                  Mostrar(objeto.sig); 
                  Mostrar2();
              break;
          
      }
      
      
        }
        while(OPC!=3);
       
       

    }

static void Agregar()
   {
      System.out.print("\nINGRESA EL DATO: ");
      X=leer2.nextLine();
      
       
       NodoU temp;
       
       temp = new NodoU();
       temp.D = X;
       temp.sig = F;
      F = temp;

    }
   
   
    static void Mostrar(NodoU act){ 
  
        while(act != null){
            System.out.print(act.D + " ");
            act = act.sig;
        }
    }
    
        
    
    static void Mostrar2()
    {
    
        System.out.print("MOSTRANDO PILA_ NODO: ");
       
        Mostrar(F);

         System.out.println("\n\n");
        
    }
     
}


   
