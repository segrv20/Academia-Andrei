public enum Frequencia {
    V3(0.2), V5(0.5);

    private double Acrecimo;

     Frequencia(double Acrecimo){
        this.Acrecimo = Acrecimo;
    }

    public double getAcrecimo() {
        return Acrecimo;
    }
}
