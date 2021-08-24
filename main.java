/**********************************************************************************************
  AUTOR: LUIS ANGEL ROCHA RONQUILLO
  FECHA: 23 - AGOSTO - 2021
  CLASE: CLASE PRINCIPAL MAIN
 
***********************************************************************************************/
package helpdesk;

public class main {

    public static void main(String[] args) {
    

                SolicitudDeServicios solServices = new SolicitudDeServicios();
                Pantalla pantalla = new Pantalla();
		HelpDesl helpdesl = new HelpDesl(solServices, pantalla);
		helpdesl.iniciar();
 
    }
}
