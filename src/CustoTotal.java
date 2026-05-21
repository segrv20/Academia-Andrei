public class CustoTotal {
    private boolean Basico,Intermediario,Premium,TresXPS,CincoXPS,Semestral,Anual;

    CustoTotal(boolean Basico, boolean Intermediario, boolean Premium, boolean TresXPS, boolean CincoXPS, boolean Semestral, boolean Anual){
        this.Basico = Basico;
        this.Intermediario = Intermediario;
        this.Premium = Premium;
        this.TresXPS = TresXPS;
        this.CincoXPS = CincoXPS;
        this.Semestral = Semestral;
        this.Anual = Anual;
    }

    public int getCustoPlano(){
        if (Basico) {
            return Planos.Basico.getValor();
        } else if (Intermediario) {
            return Planos.Intermediario.getValor();
        } else if (Premium) {
            return Planos.Premium.getValor();
        }
            return 0;
    }

    public double getCustoFrequencia(){
        if (TresXPS) {
            return Frequencia.V3.getAcrecimo();
        } else if (CincoXPS) {
            return Frequencia.V5.getAcrecimo();
        }
        return 0;
    }

    public double getPromoDuracao(){
        if (Semestral) {
            return Duracao.Semestral.getAcrecimo();
        }
        if (Anual) {
            return Duracao.Anual.getAcrecimo();
        }
        return 0;
    }
}
