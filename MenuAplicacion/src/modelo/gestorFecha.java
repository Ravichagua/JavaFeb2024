package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import controlador.*;

//aqui se gestiona la entrada de la fecha
//para que solo pueda ser ingresada en formato dd / mm / yyyy
public class gestorFecha {
    
    public  SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
    public  Scanner scanner= new Scanner(System.in);

    
    public  String obtenerFechaVencimiento() {
        Controlador instanciaControlador =new Controlador();
        //se crea un bucle, junto con un capturador de exepciones
        do{
        String fechaIngreso = JOptionPane.showInputDialog(null, "Ingresa la fecha de vencimiento (dd/mm/yy):", "fecha", JOptionPane.QUESTION_MESSAGE);        
        
        if(fechaIngreso==null){  //volver al menu si se pulsa cancelar         
            instanciaControlador.iniciar();
        }

        try {
            Date fecha = sdf.parse(fechaIngreso);//verifica si la fecha se ingreso en formato dd/mm/yyy
            return sdf.format(fecha);//retorna en string la fecha
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa una fecha valida.", "Error", JOptionPane.ERROR_MESSAGE); 
        }
        }while(true);
    }
}