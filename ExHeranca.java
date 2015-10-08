/* Criando uma classe Pessoa com atributos de nome e cpf*/
public class Pessoa {
  public String nome;
  public String cpf;
  
  public Pessoa(String _nome, String _cpf, { 
    his.nome = _nome;
    this.cpf = _cpf;
  }
}

/*Ex de Classes que Herdam de Pessoa */

public class Aluno extends Pessoa {
  public Aluno(String _nome, String _cpf) {
    super(_nome, _cpf);
  }
  
  public String matricula;
}

public class Professor extends Pessoa { 
  public Professor(String _nome, String _cpf, { 
    super(_nome, _cpf);
  }
  public double salario;
  public String disciplina;
}

/*As classes Professor e Aluno herdam atributos da Classe Pessoa, pois Aluno e Professor sao um tipo de pessoa */
