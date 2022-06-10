package Model;

public class Venda {    
    private int idVenda;
    private int idProduto;
    private int qtdVendida;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + ", idProduto=" + idProduto + ", qtdVendida=" + qtdVendida + '}';
    }
    
}
