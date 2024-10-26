public class Morango extends BaseDecorator{
    public Morango(Adicional adicional) {
        super(adicional);
    }

    @Override
    public String getDescricao() {
        return " com morango.";
    }

    @Override
    public double custo() {
        return 2.0;
    }
}
