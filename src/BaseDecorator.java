public abstract class BaseDecorator implements Adicional{
    protected Adicional wrapper;

    public BaseDecorator(Adicional adicional) {
        this.wrapper = adicional;
    }

    @Override
    public String getDescricao() {
        return "";
    }

    @Override
    public double custo() {
        return 0;
    }
}
