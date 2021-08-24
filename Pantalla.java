/**********************************************************************************************
  AUTOR: LUIS ANGEL ROCHA RONQUILLO
  FECHA: 23 - AGOSTO - 2021
  CLASE: PANTALLA
 
***********************************************************************************************/
package helpdesk;
import java.util.Scanner;

public class Pantalla {
  Scanner in = new Scanner(System.in);
  private Scanner teclado;
  private Scanner entrada;
  public Pantalla(){
  this.teclado = new Scanner(System.in);
  this.entrada = new Scanner(System.in);
}
    
  public int leerNumEntero(){
      int leerNumEntero;
            leerNumEntero = teclado.nextInt();
            return leerNumEntero;
  }
  
  public int AsistenciaoServicio(){
      int leerNumE;
          leerNumE = teclado.nextInt();
          return leerNumE;
  }
   public String leerDescPro(){
       String leerTxt;
       leerTxt = teclado.nextLine();
       return leerTxt;
   } 
   
}
