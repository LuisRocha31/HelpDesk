/**********************************************************************************************
  AUTOR: LUIS ANGEL ROCHA RONQUILLO
  FECHA: 23 - AGOSTO - 2021
  CLASE: HELPDESK
  
***********************************************************************************************/
package helpdesk;
import java.util.Scanner;


public class HelpDesl {
    Scanner entrada = new Scanner(System.in);
    SolicitudDeServicios solServices; 
    Pantalla pantalla;

    
    public HelpDesl(SolicitudDeServicios solServices,Pantalla pantalla){
        this.solServices = solServices;
        this.pantalla = pantalla;
        
    }

     public void iniciar() {    
      Titulo();
      NumCliente();
      TipoServicio();
      HoraFechaActuales();
      MostrarDatosAsesoria();
      Tecnico();

    }
      public void Titulo(){
          System.out.println(" ***********HELP-DESK*********** ");
          System.out.println(" ");
      }
      public void NumCliente(){
         System.out.println("INGRESA EL NUMERO DE CLIENTE: ");
         int numCliente = pantalla.leerNumEntero();
      }
      public void TipoServicio(){
          System.out.println("SI SOLICITA ASISTENCIA INGRESE 1, SI SOLICITA UN SERVICIO INGRESE 2");
          int tipoServicio = pantalla.AsistenciaoServicio();
          if(tipoServicio == 1){
           String despro;
           System.out.println("USTED SOLICITO ASISTENCIA. ¿CUAL ES SU PROBLEMA?");
           despro = entrada.nextLine();
           System.out.println("GRACIAS!!!");
          }else if(tipoServicio == 2){
            String despro;
            String fecha;
            String hora;
           System.out.println("USTED SOLICITO UN SERVICIO. ¿CUAL ES SU PROBLEMA?");
           despro = entrada.nextLine();
           System.out.println("INGRESE LA FECHA EN LA QUE QUIERE SER ATENDIDO, EN EL SIGUIENTE FORMATO: (AÑO-MES-DIA)");
           fecha = entrada.nextLine();
           System.out.println("INGRESE LA HORA EN LA QUE QUIERE SER ATENDIDO, EN EL SIGUIENTE FORMATO: (HORA:MINUTOS)");
           hora = entrada.nextLine();
           System.out.println("GRACIAS!!!");
          }else{
           System.out.println("LA OPCION SELECCIONADA NO SE ENCUENTRA DISPONIBLE, INTENTELO DESPUES");
           System.exit(0);
          }
      }

       public void HoraFechaActuales(){
          System.out.println("");
          System.out.println("************************************************************************");
          SolicitudDeServicios horafechaActuales = new SolicitudDeServicios();
          horafechaActuales.FechayHora();
      }
       public void Tecnico(){
       SolicitudDeServicios selectecnico = new SolicitudDeServicios();
       selectecnico.tecnicoazar();
       }
       
       public void MostrarDatosAsesoria(){
           System.out.println("NUMERO DE CLIENTE: __________________________");
           System.out.println("TIPO DE SERVICIO: ___________________________");
           System.out.println("RESPUESTA BRINDADA: _________________________");
           System.out.println("FECHA ACORDADA PARA BRINDAR EL SERVICIO: ____ ");
           System.out.println("HORA ACORDADA PARA BRINDAR EL SERVICIO: _____ ");

       }

       
           
       }
  


