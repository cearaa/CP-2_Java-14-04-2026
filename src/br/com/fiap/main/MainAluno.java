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
        aluno2.setDataDeNascimento(LocalDate.parse("03/02/2008", dtf));

        //Dois construtores com parâmetro que o usuário irá digitar pelo JOPtionPane
        int cadastroFIAP3 = Integer.parseInt(JOptionPane.showInputDialog("Dígite o RM do aluno número 3: "));
        String nomeAluno3 = JOptionPane.showInputDialog("Dígite o nome completo do aluno número 3: ");
        LocalDate dataNascimentoA3 = LocalDate.parse(JOptionPane.showInputDialog("Data de nascimento do aluno 3 em formato BR (dd/MM/yyyy): ", dtf));
        Aluno aluno3 = new Aluno(cadastroFIAP3, nomeAluno3, dataNascimentoA3);

        int cadastroFIAP4 = Integer.parseInt(JOptionPane.showInputDialog("Dígite o RM do aluno número 4: "));
        String nomeAluno4 = JOptionPane.showInputDialog("Dígite o nome completo do aluno número 4: ");
        LocalDate dataNascimentoA4 = LocalDate.parse(JOptionPane.showInputDialog("Data de nascimento do aluno 4 em formato BR (dd/MM/yyyy): ", dtf));
        Aluno aluno4 = new Aluno(cadastroFIAP4, nomeAluno4, dataNascimentoA4);

        String mensagemFormat = String.format(
                "------------------------ DADOS DOS ALUNOS -----------------------\n" +
                        "Aluno 1: \nRM %d - %s\nIdade: %s\n\n" +
                        "Aluno 2: \nRM %d - %s\nIdade: %s\n\n" +
                        "Aluno 3: \nRM %d - %s\nIdade: %s\n\n" +
                        "Aluno 4: \nRM %d - %s\nIdade: %s",
                aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdadeCompleta(dataAtual),
                aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdadeCompleta(dataAtual),
                aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdadeCompleta(dataAtual),
                aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdadeCompleta(dataAtual)
        );
        JOptionPane.showMessageDialog(null, mensagemFormat);
    }
}
