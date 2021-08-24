/**********************************************************************************************
  AUTOR: LUIS ANGEL ROCHA RONQUILLO
  FECHA: 23 - AGOSTO - 2021
  CLASE: SOLICITUDDESERVICIOS
 
***********************************************************************************************/
package helpdesk;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SolicitudDeServicios {
     Scanner in = new Scanner(System.in);
    //METODOS
    private int numCliente;
    private int tipoServicio;
    private String descProblema;
    private String resBrindada;
    private String fecAcordada;
    private String horaAcordada;
    private String tecnicoAsignado;
    private Scanner teclado;
    private Scanner entrada;
    public SolicitudDeServicios(){
   this.teclado = new Scanner(System.in);
   this.entrada = new Scanner(System.in);
}

// MUESTRA LA FECHA Y HORA DEL SISTEMA O FECHA Y HORA ACTUAL
    public void FechayHora(){
        LocalTime horaActual = LocalTime.now();
        System.out.print("HORA DE SOLICITUD: ____________________________"+horaActual);
        LocalDate fechaActual = LocalDate.now();
        System.out.println("\nFECHA DE SOLICITUD: _________________________"+fechaActual);
        
    }
   
 // TODOS LOS SETERS Y GETTERS

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(int tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
      
    public String getResBrindada() {
        return resBrindada;
    }

    public void setResBrindada(String resBrindada) {
        this.resBrindada = resBrindada;
    }

    public String getFecAcordada() {
        return fecAcordada;
    }

    public void setFecAcordada(String fecAcordada) {
        this.fecAcordada = fecAcordada;
    }

    public String getHoraAcordada() {
        return horaAcordada;
    }

    public void setHoraAcordada(String horaAcordada) {
        this.horaAcordada = horaAcordada;
    }

    public String getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(String tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }
    
    public void tecnicoazar(){
        Random rand = new Random();
        List<String> lista = Arrays.asList("RAFAEL MORENO ALVAREZ", "CARLOS GONZALEZ DE LA CRUZ", "FILIBERTO ROJAS ESPINOSA", "XIMENA OCAÑA DAVALOS", "JUAN CARLOS CORDOVA MARTINEZ", "CINTHYA CHAVEZ ESTRADA", "DANIELA ROMERO PILLADO", "ALEJANDRO HERNANDEZ CASTILLO", "MARIO GARCIA TORRIJOS", "ALEXA ALCANTARA REYES");

        int numero = 1;

        for (int i = 0; i < numero; i++) {
            int nAleatorio = rand.nextInt(lista.size());
            String elementoAzar = lista.get(nAleatorio);
            System.out.println("NOMBRE TECNICO QUE TE ATENDERA: _____________"+elementoAzar);
            System.out.println("************************************************************************");
        }
    }  
}

