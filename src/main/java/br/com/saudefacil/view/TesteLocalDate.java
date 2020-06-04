package br.com.saudefacil.view;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteLocalDate {

	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento (dd/mm/aaaa)");
		String data = leTeclado.next();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(data, dateFormat);
		System.out.println(date);
	}

}
