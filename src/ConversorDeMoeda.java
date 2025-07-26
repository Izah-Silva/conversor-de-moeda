public class ConversorDeMoeda {
    private double taxaCambio;
    public ConversorDeMoeda(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }
    public double converterReaisParaDolares(double valorEmReais) {
        return valorEmReais/taxaCambio;
    }
}
