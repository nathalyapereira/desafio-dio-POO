package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
   
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO * cargaHoraria;
    }
    public Curso() {
    }

    public Curso(String nome, String descricao, int cargaHoraria) {
      super(nome, descricao);
      this.cargaHoraria = cargaHoraria;
    }
   
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "\n\nTitulo: " + getTitulo() + "\n"+
        "Descricao: " + getDescricao() + "\n"+
        "Carga Horaria: " + cargaHoraria ;
    }


    

}
