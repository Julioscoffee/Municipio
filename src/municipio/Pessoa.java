package municipio;

public class Pessoa {
    //Características = Variáveis = Atributos
    String nome;
    int idade;
    char sexo;
    double rendaFixa;
    
    //Funcionalidade = Métodos
    public void rendaAnual(){
        double resultado = this.rendaFixa * 12;
        System.out.println(resultado);
    }
}
