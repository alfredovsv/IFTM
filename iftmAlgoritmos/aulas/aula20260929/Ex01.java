package aulas.aula20260929;
public class Ex01{
    public static void main (String[] args){
        StringBuilder texto = new StringBuilder("IFTM");
		String atual = texto.toString();
		System.out.println(atual);
		System.out.println(texto);
		
		atual = atual + " UDI CENTRO";
		texto.append(" UDI CENTRO"); // não cria cópia, modifica o próprio objeto.
		texto.append(" 2026."); // inserir o parametro no fim do texto
		System.out.println(atual);
		System.out.println(texto);
		
		texto.insert(0, "Campus: "); // inserir o segundo parametro na posição do primeiro parametro
		System.out.println(texto);
		
		texto.delete(0,2); // apagar um conjunto de caracteres
		System.out.println(texto);
		
		texto.deleteCharAt(4); //apagar o caractere na posição do parametro
		System.out.println(texto);
		
		texto.replace(0,4, "Campus:"); //substituir uma parte da String
		System.out.println(texto);
		
		texto.reverse(); // inverte a String
		System.out.println(texto);
		texto.reverse();
		
		texto.setCharAt(0, 'X'); // modificar um caractere apenas
		System.out.println(texto);
    }
}