/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

/**
 *
 * @author Fernanda
 */
import ec.edu.ups.controlador.ControladorTexto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //primero colocar la ruta.
        ControladorTexto tc = new ControladorTexto();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a;

        //Escribe la palabra
        System.out.println("Ingrese Texto a escribir");
        String palabra = sc.next();
        tc.Escritura(palabra);

       //lee el archivo
        tc.Lectura();
        //guarda el resultado en un txt
        String ruta = "archivos.txt";
        File archivo = new File(ruta);
        File[] archivos = archivo.listFiles();
        for (File newarchivo : archivos) {
            if (!newarchivo.getName().equals("Resultado.txt")) {
                tc.LecturaResultado(ruta + "\\" + newarchivo.getName());
            }
        }
        tc.guardaResultado();
        System.out.println("Gracias");
        i = 0;
        System.out.flush();
        System.err.println("Ingrese Opcion Valida");

    }
}



