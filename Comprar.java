package Polimorfismo;

public class Comprar {
    public double RealizarCompra(Cupom cupom, double vp) {
        double desconto = vp * 0.5;
        cupom.Desconto = desconto;
        double valorComDesconto = vp - cupom.Desconto;
        return valorComDesconto;
    }
}
