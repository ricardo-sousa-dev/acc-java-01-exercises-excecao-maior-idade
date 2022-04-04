package com.trybe.acc.java.excecaomaioridade;

/** Classe do desafio. */
public class Show {

  /** Método do desafio. */
  public boolean permitirEntrada(int idade) throws PessoaMenorDeIdadeException {

    if (idade < 18) {
      throw new PessoaMenorDeIdadeException(idade); // lança exceção
    } else {
      return true;
    }
  }

  public static void main(String[] args) throws PessoaMenorDeIdadeException {
    Show show = new Show(); // instancia a classe
    System.out.println(show.permitirEntrada(17)); // chama o método
  }
}

// referencies:
// https://www.youtube.com/watch?v=Xt0CpwJT5yY
// https:// www.devmedia.com.br/trabalhando-com-excecoes-em-java/27601
// www.caelum.com.br/apostila-java-orientacao-objetos/
// excecoes-e-controle-de-erros#exercicio-para-comecar-com-os-conceitos
// pt.stackoverflow.com/questions/71670/
// como-criar-uma-exception-exce%C3%A7%C3%A3o-customizada-em-java
// https:// www.devmedia.com.br/tratando-excecoes-em-java/25514
// www.devmedia.com.br/checked-exceptions-
// versus-unchecked-exceptions-trabalhando-com-excecoes/29626
