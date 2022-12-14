package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-09-02");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-02T11:40:20");
		Instant d06 = Instant.parse("2022-09-02T11:43:01Z");
		Instant d07 = Instant.parse("2022-09-02T11:43:01-03:00");
		
		LocalDate d08 = LocalDate.parse("05/05/2000", fmt01);
		LocalDateTime d09 = LocalDateTime.parse("05/05/2000 01:30", fmt02);
		
		LocalDate d10 = LocalDate.of(10, 12, 5);
		
		
		System.out.println("D01= " +d01);
		System.out.println("D02= " +d02);
		System.out.println("D03= " +d03);
		System.out.println("D04= " +d04);
		System.out.println("D05= " +d05);
		System.out.println("D06= " +d06);
		System.out.println("D07= " +d07);
		System.out.println("D08= " +d08);
		System.out.println("D09= " +d09);
		System.out.println("D10= " +d10);
		
		System.out.println("Formatado: " +d08.format(fmt01));
	}

}
