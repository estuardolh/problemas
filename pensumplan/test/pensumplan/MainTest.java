package pensumplan;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.google.gson.Gson;

import json.AnotherFileReader;
import pensum.Root;

public class MainTest {
	@Test
	public void testFileReader() {
		String text_file_reader = null;
		String reason = "";
		try {
			text_file_reader = AnotherFileReader.getTextFromFile("./test/resources/test_reader.txt");
		}catch(Exception e) {
			reason = e.getMessage();
		}
		assertNotNull(reason, text_file_reader);
	}
	@Test
	public void testDeserializeRootPensum() {
		String pensum_string = "{\n" + 
				"	\"pensum\":{\n" + 
				"		\"org\":\"UMG\"\n" + 
				"		, \"sub\":\"ING\"\n" + 
				"		, \"spec\":\"SYS\"\n" + 
				"		, \"cycles\":[\n" + 
				"			{\n" + 
				"				\"name\": \"PRIMER CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910001\", \"name\":\"DESARROLLO HUMANO Y PROFESIONAL\", \"credits\":4, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910002\", \"name\":\"METODOLOGIA DE LA INVESTIGACION\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910003\", \"name\":\"CONTABILIDAD I\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910004\", \"name\":\"INTRODUCCION A LOS SISTEMAS DE COMPUTO\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910005\", \"name\":\"LOGICA DE SISTEMAS\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\n" + 
				"				\"name\":\"SEGUNDO CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910006\", \"name\":\"PRECALCULO\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910007\", \"name\":\"ALGEBRA LINEAL\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910008\", \"name\":\"ALGORITMOS\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910009\", \"name\":\"CONTABILIDAD II\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910010\", \"name\":\"MATEMATICA DISCRETA\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\n" + 
				"				\"name\":\"TERCER CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910011\", \"name\":\"FISICA I\", \"credits\":5, \"requires\":[\"910006\"], \"min\":0}\n" + 
				"				, {\"code\":\"910012\", \"name\":\"PROGRAMACION I\", \"credits\":5, \"requires\":[\"910008\"], \"min\":0}\n" + 
				"				, {\"code\":\"910013\", \"name\":\"CALCULO I\", \"credits\":5, \"requires\":[\"910006\"], \"min\":0}\n" + 
				"				, {\"code\":\"910014\", \"name\":\"PROCESO ADMINISTRATIVO\", \"credits\":4, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910015\", \"name\":\"DERECHO INFORMATICO\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\n" + 
				"				\"name\":\"CUARTO CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910016\", \"name\":\"MICROECONOMIA\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910017\", \"name\":\"PROGRAMACION II\", \"credits\":5, \"requires\":[\"910012\"], \"min\":0}\n" + 
				"				, {\"code\":\"910018\", \"name\":\"CALCULO II\", \"credits\":5, \"requires\":[\"910013\"], \"min\":0}\n" + 
				"				, {\"code\":\"910019\", \"name\":\"ESTADISTICA I\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910020\", \"name\":\"FISICA II\", \"credits\":5, \"requires\":[\"910011\"], \"min\":0}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\n" + 
				"				\"name\":\"QUINTO CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910021\", \"name\":\"METODOS NUMERICOS\", \"credits\":5, \"requires\":[], \"min\":70}\n" + 
				"				, {\"code\":\"910022\", \"name\":\"PROGRAMACION III\", \"credits\":5, \"requires\":[\"910017\"], \"min\":0}\n" + 
				"				, {\"code\":\"910023\", \"name\":\"EMPRENDEDORES DE NEGOCIOS\", \"credits\":5, \"requires\":[], \"min\":0}\n" + 
				"				, {\"code\":\"910024\", \"name\":\"ELECTRONICA ANALOGICA\", \"credits\":5, \"requires\":[\"910020\"], \"min\":0}\n" + 
				"				, {\"code\":\"910025\", \"name\":\"ESTADISTICA II\", \"credits\":5, \"requires\":[\"910019\"], \"min\":0}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\n" + 
				"				\"name\":\"SEXTO CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910026\", \"name\":\"INVESTIGACION DE OPERACIONES\", \"credits\":5, \"requires\":[], \"min\":80}\n" + 
				"				, {\"code\":\"910027\", \"name\":\"BASES DE DATOS I\", \"credits\":5, \"requires\":[\"910022\"], \"min\":0}\n" + 
				"				, {\"code\":\"910028\", \"name\":\"AUTOMATAS Y LENGUAJES FORMALES\", \"credits\":5, \"requires\":[], \"min\":80}\n" + 
				"				, {\"code\":\"910029\", \"name\":\"SISTEMAS OPERATIVOS I\", \"credits\":5, \"requires\":[], \"min\":80}\n" + 
				"				, {\"code\":\"910030\", \"name\":\"ELECTRONICA DIGITAL\", \"credits\":5, \"requires\":[\"910024\"], \"min\":0}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\n" + 
				"				\"name\":\"SÉPTIMO CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910031\", \"name\":\"BASES DE DATOS II\", \"credits\":5, \"requires\":[\"910027\"], \"min\":0}\n" + 
				"				, {\"code\":\"910032\", \"name\":\"ANALISIS DE SISTEMAS I\", \"credits\":5, \"requires\":[], \"min\":100}\n" + 
				"				, {\"code\":\"910033\", \"name\":\"SISTEMAS OPERATIVOS II\", \"credits\":5, \"requires\":[\"910029\"], \"min\":0}\n" + 
				"				, {\"code\":\"910034\", \"name\":\"ARQUITECTURA DE COMPUTADORAS I\", \"credits\":5, \"requires\":[], \"min\":100}\n" + 
				"				, {\"code\":\"910035\", \"name\":\"COMPILADORES\", \"credits\":5, \"requires\":[\"910028\"], \"min\":0}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\n" + 
				"				\"name\":\"OCTAVO CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910036\", \"name\":\"DESARROLLO WEB\", \"credits\":5, \"requires\":[\"910031\"], \"min\":0}\n" + 
				"				, {\"code\":\"910037\", \"name\":\"ANALISIS DE SISTEMAS II\", \"credits\":5, \"requires\":[\"910032\"], \"min\":0}\n" + 
				"				, {\"code\":\"910038\", \"name\":\"REDES DE COMPUTADORAS I\", \"credits\":5, \"requires\":[], \"min\":125}\n" + 
				"				, {\"code\":\"910039\", \"name\":\"ETICA PROFESIONAL\", \"credits\":4, \"requires\":[], \"min\":100}\n" + 
				"				, {\"code\":\"910040\", \"name\":\"ARQUITECTURA DE COMPUTADORAS II\", \"credits\":5, \"requires\":[\"910034\"], \"min\":0}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\n" + 
				"				\"name\":\"NOVENO CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910041\", \"name\":\"ADMINISTRACION DE TECNOLOGIAS DE INFORMACION\", \"credits\":5, \"requires\":[], \"min\":150}\n" + 
				"				, {\"code\":\"910042\", \"name\":\"INGENIERIA DE SOFTWARE\", \"credits\":5, \"requires\":[], \"min\":150}\n" + 
				"				, {\"code\":\"910043\", \"name\":\"PROYECTOD DE GRADUACION I\", \"credits\":6, \"requires\":[], \"min\":150}\n" + 
				"				, {\"code\":\"910044\", \"name\":\"REDES DE COMPUTADORAS II\", \"credits\":5, \"requires\":[\"910038\"], \"min\":0}\n" + 
				"				, {\"code\":\"910045\", \"name\":\"INTELIGENCIA ARTIFICIAL\", \"credits\":5, \"requires\":[], \"min\":150}\n" + 
				"				]\n" + 
				"			}\n" + 
				"			, {\"name\":\"DÉCIMO CICLO\"\n" + 
				"				, \"courses\":[\n" + 
				"				{\"code\":\"910046\", \"name\":\"TELECOMUNICACIONES\", \"credits\":5, \"requires\":[], \"min\":175}\n" + 
				"				, {\"code\":\"910047\", \"name\":\"SEMINARIOS DE TECNOLOGIAS DE INFORMACION\", \"credits\":6, \"requires\":[], \"min\":175}\n" + 
				"				, {\"code\":\"910048\", \"name\":\"ASEGURAMIENTO DE LA CALIDAD DEL SOFTWARE\", \"credits\":5, \"requires\":[], \"min\":175}\n" + 
				"				, {\"code\":\"910049\", \"name\":\"PROYECTO DE GRADUACION II\", \"credits\":6, \"requires\":[\"910043\"], \"min\":0}\n" + 
				"				, {\"code\":\"910050\", \"name\":\"SEGURIDAD Y AUDITORIA DE SISTEMAS\", \"credits\":5, \"requires\":[], \"min\":175}\n" + 
				"				]\n" + 
				"			}\n" + 
				"		]\n" + 
				"	}\n" + 
				"}\n";
		Gson gson = new Gson();
		Root root_pensum_raw = gson.fromJson(pensum_string, Root.class);
		
		assertNotNull("Not able to deserialize json string", root_pensum_raw);
	}
	
}
