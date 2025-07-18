import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Intrudução básica e POO.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java e Kotlin");
        curso2.setDescricao("Ampliando o conhecimento Básico e intermediario. ");
        curso2.setCargaHoraria(5);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Práticas em APIs, Banco de dados e frameworks. tudo isso em Java");
        mentoria.setData(LocalDate.now());

     /*   System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
      */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Apredendo a desenvolver em POO, desenvolvimento de aplicações orientadas a objetos, com práticas em APIs, banco de dados e frameworks modernos. ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devItala = new Dev();
        devItala.setNome("Itala");
        devItala.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Itala" + devItala.getConteudosInscritos());
        devItala.progredir();
        devItala.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Itala" + devItala.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Itala" + devItala.getConteudosConcluidos());
        System.out.println("XP:" + devItala.calcularTotalXp());


        System.out.println("---------------------------");

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Diego" + devDiego.getConteudosInscritos());
        devDiego.progredir();
        devDiego.progredir();
        devDiego.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Diego" + devDiego.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Diego" + devDiego.getConteudosConcluidos());
        System.out.println("XP:" + devDiego.calcularTotalXp());




        }
    }