/**
 * Monitora os parametros essenciais da agua do aquario.
 */
public class ControleQualidadeAgua {
    private final double ph;
    private final double temperatura;

    public ControleQualidadeAgua(double ph, double temperatura) {
        this.ph = ph;
        this.temperatura = temperatura;
    }

    /**
     * Verifica se o pH e a temperatura estao dentro dos limites seguros.
     *
     * @return true quando ambos os parametros estao adequados
     */
    public boolean verificarParametros() {
        if (ph < 6.8 || ph > 7.6) {
            System.out.println("ALERTA QA: Nivel de pH fora do limite ideal!");
            return false;
        }

        if (temperatura < 22.0 || temperatura > 28.0) {
            System.out.println("ALERTA QA: Temperatura fora do limite seguro!");
            return false;
        }

        System.out.println("STATUS: Parametros da agua em niveis ideais.");
        return true;
    }

    public double getPh() {
        return ph;
    }

    public double getTemperatura() {
        return temperatura;
    }
}
