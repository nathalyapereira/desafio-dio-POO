import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Curso Java", "Descrição do curso Java", 4);
        
        Curso curso2 = new Curso("Curso JavaScript", "Descrição do curso JavaScript", 4);
        

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        System.out.println("--------------------------------------------------------------------------------");
        Dev devNathalya = new Dev();
        devNathalya.setNome("Nathalya");
        devNathalya.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscrito Nathalya: " + devNathalya.getConteudosInscritos()+" :)");
        devNathalya.progredir();
        devNathalya.progredir();
        System.out.println("----------------------------------------");
        System.out.println("Conteúdos Inscrito Nathalya: " + devNathalya.getConteudosInscritos()+" :)");
        System.out.println("Conteúdos Concluidos Nathalya: " + devNathalya.getConteudosConcluidos()+" :)");
        devNathalya.imprimirCertificado(bootcamp);
        System.out.println("Conteúdos Certificados Nathalya: " + devNathalya.getConteudosCertificado()+" :)");
        System.out.println("XP: " + devNathalya.calcularTotalXp());

        System.out.println("--------------------------------------------------------------------------------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscrito Gabriel: " + devGabriel.getConteudosInscritos()+" :)");
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("----------------------------------------");
        System.out.println("Conteúdos Inscrito Gabriel: " + devGabriel.getConteudosInscritos()+" :)");
        System.out.println("Conteúdos Concluidos Gabriel: " + devGabriel.getConteudosConcluidos()+" :)");
        devGabriel.imprimirCertificado(bootcamp);
        System.out.println("Conteúdos Certificados Gabriel: " + devGabriel.getConteudosCertificado()+" :)");
        System.out.println("XP: " + devGabriel.calcularTotalXp());
    }
}
