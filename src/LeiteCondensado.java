public class LeiteCondensado extends BaseDecorator{
    public LeiteCondensado(Adicional adicional) {
        super(adicional);
    }

    @Override
    public String getDescricao() {
        return " com leite condensado.";
    }

    @Override
    public double custo() {
        return 2.0;
    }
}
