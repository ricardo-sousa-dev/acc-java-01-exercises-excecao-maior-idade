package com.trybe.acc.java.excecaomaioridade;

/** Classe de exceção. */
public class PessoaMenorDeIdadeException extends Exception {
  /** Construtor da classe. */
  protected int idade;

  public PessoaMenorDeIdadeException(int idade) {
    super("Pessoa menor de idade: " + idade);
  }
}

// referency @Override:
// https://stackoverflow.com/questions/39313900/tostring-method-is-not-inherting-from-its-super-class
