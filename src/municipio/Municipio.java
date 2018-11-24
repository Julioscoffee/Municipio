package municipio;

import java.util.Scanner;

public class Municipio {

    public static void main(String[] args) {
        String nome;
        int idade;
        char sexo;
        double renda;
        
        //Objeto de leitura (entrada pelo terminal de dados
        Scanner pegar = new Scanner(System.in);
        
        //Entrevistando a 1ª pessoa
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Informe seu nome: ");
        pessoa1.nome = pegar.nextLine();
        System.out.println("Informe sua idade: ");
        pessoa1.idade = pegar.nextInt();
        System.out.println("Informe sua renda: ");
        pessoa1.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa1.sexo = pegar.next().charAt(0);
        
        //Entrevistando a 2ª pessoa
        Pessoa pessoa2 = new Pessoa();
        System.out.println("Informe seu nome: ");
        pessoa2.nome = pegar.next();
        System.out.println("Informe sua idade: ");
        pessoa2.idade = pegar.nextInt();
        System.out.println("Informe sua renda: ");
        pessoa2.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa2.sexo = pegar.next().charAt(0);
        
        //Entrevistando a 3ª pessoa
        Pessoa pessoa3 = new Pessoa();
        System.out.println("Informe seu nome: ");
        pessoa3.nome = pegar.next();
        System.out.println("Informe sua idade: ");
        pessoa3.idade = pegar.nextInt();
        System.out.println("Informe sua renda: ");
        pessoa3.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa3.sexo = pegar.next().charAt(0);
        
        //Printando uma pessoa = posição de memória
        System.out.println(pessoa1);
        
        //Criando um vetor para salvar o objeto
        Pessoa[] listaPessoas = {pessoa1, pessoa2, pessoa3};
        
        //Cálculo de média das idades
        int totalIdade = 0, quantidade = 0;
        for(Pessoa p : listaPessoas){
            totalIdade = totalIdade + p.idade;
            quantidade++;
        }
        
        double mediaIdade = (double)totalIdade / quantidade;
        System.out.printf("\nA média das idades foram: \n" + "%.2f" , mediaIdade + "\n");
    }
    
}
