
package COLAS;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class MENU {
    
    public static Cola_1_2 menu1 = new Cola_1_2();
    public static Cola_3 menu2 = new Cola_3();
    public static Cola_4 menu3 = new Cola_4();
    
     public static Scanner leer= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int OPCION=0;
        
      
       System.out.print("\n\n-.-.-.--.-.-.-.-.-.-.-.-.-.-.MENU PRINCIPAL-.-.-.-.--.-.-.-.-.-.-.-.\n\n");
       System.out.print("\n1-COLAS 1.1 y 1.2");
       System.out.print("\n2-COLAS 1.3");
       System.out.print("\n3-COLAS 1.4");
        System.out.print("\n4-SALIR");
            
       System.out.print("\n\nSELECCIONA UNA OPCION:  ");
       do
       {
       
       switch(OPCION=leer.nextInt())
        {
            case 1:
                menu1.main(args);
                break;
                
                case 2:
                menu2.main(args);
                break;
                
                case 3:
                menu3.main(args);
                break;
            
        }
       }
       while(OPCION!=4);
    
    }

    }
