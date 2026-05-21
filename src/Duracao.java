public enum Duracao {
    Semestral(0.1),Anual(0.2);

    private double Acrecimo;

    Duracao(double Acrecimo) {
        this.Acrecimo = Acrecimo;
    }

    public double getAcrecimo() {
        return Acrecimo;
    }
}
