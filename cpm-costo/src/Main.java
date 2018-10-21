import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class Main {

	public static void main(String[] args) {
		String[][] actividades = new String[][]{
			{"A", null},
			{"B", "A"},
			{"C", "B"},
			{"D", "B"},
			{"E", "C"},
			{"F", "D"},
			{"G", "C"},
			{"H", "E,F"},
			{"I", "G,H"}
		};
		int[][] costos = new int[][]{
			{100,350},
			{200,400},
			{80,175},
			{150,300},
			{75,325},
			{120,450},
			{125,250},
			{190,320},
			{95,170}
		};
		int[][] duraciones = new int[][]{
			{8,5},
			{6,3},
			{6,4},
			{7,4},
			{7,3},
			{2,1},
			{4,2},
			{4,1},
			{5,4}
		};
		
		CPMCosto costo_cpm = new CPMCosto();
		costo_cpm.setActividades(actividades);
		costo_cpm.setCostos(costos);
		costo_cpm.setDuraciones(duraciones);
		
		try {
			costo_cpm.resolver();
		} catch (Exception e) {
			System.err.println("Error al resolver.");
			e.printStackTrace();
		}
	}
}
