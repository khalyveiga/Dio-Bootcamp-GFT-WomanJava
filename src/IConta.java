/* INTERFACE
 ----O que é uma interface?----
 Uma classe Abstrata com todos os métodos Abstratos.
 ---- O que isso quer dizer?----
 Que é uma classe que vai obrigar a todo mundo que extender que de uma
 classe e implementar ela a implementar tudo que ela tem.
 Por padrão todos os métodos da interface já são publicos. Não faz sentido declarar public na frente.
 */
public interface IConta {
    void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, IConta contaDestino);

     void imprimirExtrato();
}



