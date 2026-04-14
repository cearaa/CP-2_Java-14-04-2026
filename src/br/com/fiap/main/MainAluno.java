package br.com.fiap.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainAluno {
    public static void main(String[] args) {

        //Formato de data padrão dos EUA e pedido nos slides
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAtual = LocalDate.now();
    }
}
