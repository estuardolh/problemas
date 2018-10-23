import java.util.ArrayList;
import java.util.Scanner;

public class CPMCosto {
	private String[][] actividades = null;
	private int[][] costos = null;
	private int[][] duraciones = null;
	
	private double[][] tabla_paso2 = null;
	
	private String[][] tabla_paso3_encabezado = null;
	private String[] tabla_paso3_rutas = null;
	private double[][] tabla_paso3 = null;
	
	public CPMCosto() {
	}
	
	public CPMCosto(String[][] actividades, int[][] costos, int[][] duraciones) {
		this.actividades = actividades;
		this.costos = costos;
		this.duraciones = duraciones;
	}
	
	public String[][] getActividades() {
		return actividades;
	}

	public void setActividades(String[][] actividades) {
		this.actividades = actividades;
	}

	public int[][] getCostos() {
		return costos;
	}

	public void setCostos(int[][] costos) {
		this.costos = costos;
	}

	public int[][] getDuraciones() {
		return duraciones;
	}

	public void setDuraciones(int[][] duraciones) {
		this.duraciones = duraciones;
	}

	public String[] resolver() throws Exception {
		if( actividades == null ) throw new Exception("Las actividades deben ser indicadas");
		if( costos == null ) throw new Exception("Los costos deben ser indicadas");
		if( duraciones == null ) throw new Exception("Las duraciones deben ser indicadas");
		
		paso1();
		paso2();
		paso3();
		
		return new String[] {};
	}
	
	private void paso1() {
		// TODO: diagrama de red aqui 
	}
	
	private void paso2() {
		int alto = tamanoDeArreglo(actividades);
		int ancho = 2;
		
		this.tabla_paso2 = new double[ alto ][ 3 ];
		
		for(int j = 0; j < alto; j++) {
			
			// calcular tiempo de compresion
			int duracion_normal = this.duraciones[j][0];
			int duracion_limite = this.duraciones[j][1];
			
			int tiempo_compresion = duracion_normal - duracion_limite;
			this.tabla_paso2[j][0] = tiempo_compresion;
			
			// calcular costo incremental
			int costo_normal = this.costos[j][0];
			int costo_limite = this.costos[j][1];
			
			int costo_incremental = costo_limite - costo_normal;
			this.tabla_paso2[j][1] = costo_incremental;
		
			// calcular costo incremental / dia(tiempo compresion)
			double costo_incremental_dia = costo_incremental / tiempo_compresion;
			this.tabla_paso2[j][2] = costo_incremental_dia;
		}
		
		imprimirTabla(this.tabla_paso2);
	}
	
	private void paso3() {
		ArrayList<String> rutas_unicas = new ArrayList<String>();
		
		for(int j = 1; j < tamanoDeArreglo(this.actividades); j++) {
			String actividad = this.actividades[j][0];
			String precedencia = this.actividades[j][1];
			
			String[] precedencias = precedencia.split(",");
			for(int i = 0; i < precedencias.length; i++) {
				char punto = precedencias[i].charAt(0);
				
				rutas_unicas.add(                   );
			}
			
		}
		// obtener rutas unicas
		for(char i = 'A'; i < 'Z'; i++) {
			
		}
	}
	
	private int tamanoDeArreglo(Object[] in) {
		return in==null?0:in.length;
	}
	
	private void imprimirTabla(double[][] tabla) {
		int alto = tamanoDeArreglo(tabla);
		int ancho = alto==0?0:tabla[0].length;
		
		for(int j = 0; j < alto; j++) {
			System.out.print("\n[");
			for(int i = 0; i < ancho; i++) {
				System.out.print(tabla[j][i]+" ");
			}
			System.out.print("]");
		}
	}
}
