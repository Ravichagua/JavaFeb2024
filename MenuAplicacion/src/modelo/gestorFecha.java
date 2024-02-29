package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//aqui se gestiona la entrada de la fecha
//para que solo pueda ser ingresada en formato dd / mm / yyyy
public class gestorFecha {
    public static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
    public static Scanner scanner= new Scanner(System.in);
//se usaron librerias


    public static String obtenerFechaVencimiento() {
        
        //se crea un bucle, junto con un capturador de exepciones
        do{
        System.out.println("Ingrese la fecha (formato: dd/mm/yyyy): ");
        
        String fechaString = scanner.nextLine();

        
        try {
            Date fecha = sdf.parse(fechaString);
            return sdf.format(fecha);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Intente nuevamente."); 
        }
        }while(true);
    }

}