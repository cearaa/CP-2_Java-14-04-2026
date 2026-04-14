package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

//CP2 de JAVA - 14/04/2026 - Pro.Gilberto
//Tárik Moussa Alma - RM: 571411
//Giovane Dias Chicoli - RM: 569750
//Fabricio Aquiles Sales da Silva - RM: 570985
public class Aluno {
    //Atributos da classe
    private int registroMatricula;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;
    //Construtor vazio
    public Aluno(){
    }
    //Construtor com parâmetros
    public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento){
        setRegistroMatricula(registroMatricula);
        this.nomeCompleto = nomeCompleto;
        setDataDeNascimento(dataDeNascimento);
    }
    //Implementação dos métodos getters/setters das variaveis. ( Alt + Insert )
    public int getRegistroMatricula() {
        return registroMatricula;
    }
    public void setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999){
                this.registroMatricula = registroMatricula;
            } else {
                throw new Exception("Registro de mátricula inválida!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        LocalDate dataMinima = LocalDate.parse("1960-01-01");
        LocalDate hoje = LocalDate.now();
        try {
            if ((dataDeNascimento.isEqual(dataMinima) || dataDeNascimento.isAfter(dataMinima)) && (dataDeNascimento.isEqual(hoje) || dataDeNascimento.isBefore(hoje))) {
            } else {
                throw new Exception("Data de Nascimento fora dos parâmetros!! ");
            }
            this.dataDeNascimento = dataDeNascimento;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Métodos da classe - Public dessa vez
    public String calcularIdadeCompleta(LocalDate dataAtual){
        Period tempo = Period.between(dataDeNascimento, dataAtual);
        return String.format("Quantidade de anos: %d\nQuantidade de meses: %d\nQuantidade de dias: %d\n", tempo.getYears(), tempo.getMonths(), tempo.getDays());
    }
}


