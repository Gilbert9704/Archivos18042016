/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printstream;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class ModificarArchivo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        PrintStream salida = new PrintStream(new File("output.txt"));
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Scanner opcion = new Scanner(System.in);
        boolean indicador = true;
        while(indicador){
            salida.print(entrada.readLine() + ",");
            System.out.println("Desea continuar");
            indicador = opcion.hasNext();//http://proxy.unal.edu.co:8080
        }
        salida.close();
    }
    
}
