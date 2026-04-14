package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//CP2 de JAVA - 14/04/2026 - Pro.Gilberto
//Tárik Moussa Alma - RM: 571411
//Giovane Dias Chicoli - RM: 569750
//Fabricio Aquiles Sales da Silva - RM: 570985
public class MainAluno {
    public static void main(String[] args) {

        //Formato de data padrão dos EUA e pedido nos slides
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAtual = LocalDate.now();

        //Tópico 2 do CP - Dois construtores vazios da classe aluno
        Aluno aluno1 = new Aluno();
        aluno1.setRegistroMatricula(571411);
        aluno1.setNomeCompleto("Tárik Moussa Alma");
        aluno1.setDataDeNascimento(LocalDate.parse("03/02/2008", dtf));

        Aluno aluno2 = new Aluno();
        aluno2.setRegistroMatricula(570985);
        aluno2.setNomeCompleto("Fábricio Aquiles Sales da Silva");
        aluno2.setDataDeNascimento(LocalDate.parse("digite", dtf));

        //Dois construtores com parâmetro que o usuário irá digitar pelo JOPtionPane
        int cadastroFIAP3 = Integer.parseInt(JOptionPane.showInputDialog("Dígite o RM do aluno: "));

    }
}
