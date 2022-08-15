package uniandes.dpoo.taller0.modificacion;

//import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.InputStreamReader;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion
{	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	//public static void main(String[] args) {
	System.out.println("Hola, mundo!");
	CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
	System.out.println(calc.paisConMasMedallistas());
	}
}