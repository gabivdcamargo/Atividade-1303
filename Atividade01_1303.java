package aula_string_no_java;

public class Atividade01_1303 {

	public static void main(String[] args) {
		String todosErros="Tedro Tescava Teixes no Tier";
		String corrigir= todosErros.replaceAll("T","P");
		
		System.out.println("Antes: "+ "Tedro Tescava Teixes no Tier" +"Depois:"+ corrigir);
		System.out.println("Antes: "+ todosErros+ "Depois: "+ corrigir);
		

	}

}
