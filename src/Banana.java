public class Banana extends BaseDecorator{
    public Banana(Adicional adicional) {
        super(adicional);
    }

    @Override
    public String getDescricao() {
        return " com banana.";
    }

    @Override
    public double custo() {
        return 2.00;
    }
}
