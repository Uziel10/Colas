
package nodos;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class Nodo_Cola {
    
    public static Scanner leer = new Scanner(System.in);
    public static Scanner leer2 = new Scanner(System.in);
    public static int OPC;
    public static String X;
   public static NodoJ fin;
    


    static class NodoJ{
        
        String D;
        NodoJ sig;
        
    }

    public static void main(String[] args) {
        
        NodoJ objeto2 = new NodoJ();
        
          do
        {
        System.out.print("\t---MENU---\n");
        System.out.print("\t---COLA_NODO---\n");
        System.out.print("\t\t\n1-AGREGAR\n"+
                         "2-MOSTRAR");
        
        System.out.print("\n\nELIGE UNA OPCION: ");
           
        
       
      switch(OPC = leer.nextInt())
      {
          case 1:
              Agregar();
               break;
              
              
              case 2:
                  Mostrar(objeto2.sig); 
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
      
       NodoJ temp;
       temp = new NodoJ();
       
       
       temp.sig = fin;        
       fin= temp;
       
       temp = new NodoJ(); 
       
        temp.D=X;
        

       NodoJ temp2;
       temp2 = fin;    
       
       while(temp2.sig != null)
       
       temp2 = temp2.sig;
       temp2.sig = temp;

    }

    static void Mostrar(NodoJ act){ 
        
        while(act != null){     
            System.out.print(act.D+ " ");
            act = act.sig;   
        }
    }   
    
    static void Mostrar2()
    {
        System.out.print("MOSTRANDO COLA_ NODO: ");
        Mostrar(fin);
         System.out.println("\n\n");
        
    }
}
