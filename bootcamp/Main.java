package bootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java para Iniciantes", 40, "Curso básico de Java");
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", LocalDate.now(), "Mentoria sobre Java");

        List<Curso> cursos = new ArrayList<>();
        cursos.add(cursoJava);

        List<Mentoria> mentorias = new ArrayList<>();
        mentorias.add(mentoriaJava);

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java", "Bootcamp focado em Java", cursos, mentorias);

        Dev dev = new Dev("João", 25, cursos);

        System.out.println("Bootcamp: " + bootcampJava.getNome());
        System.out.println("Dev: " + dev.getNome());
    }
}
