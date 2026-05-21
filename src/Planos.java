public enum Planos {
    Basico(80), Intermediario(120), Premium(180);

    private int Valor;

    Planos(int Valor) {
        this.Valor = Valor;
    }

    public int getValor() {
        return Valor;
    }
}
