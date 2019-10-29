public class Locacao{

    int id;
    String dataLocacao, dataDevolucao;
    Cliente cliente;

    Locacao(int id, Cliente cliente, String dataLocacao, String dataDevolucao){
        this.id = id;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
    }
}