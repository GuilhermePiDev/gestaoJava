public class Dados {

    private double chassi;
    private double pesoBruto;
    private double reboque;
    private double outrosEqui;
    private double velOperacionalIda;
    private double velOperacionalVolta;
    private double tempoD;
    private double tempoC;
    private double distanciaPerIda;
    private double distanciaPerVolta;
    private double jornada;
    private double tDiario;
    private double diasUteis;
    private double manutencao;
    private String tipo;
    private double qntd;

    private int resultadoH2 = 0;

    public Dados(double chassi, double pesoBruto, double reboque, double outrosEqui,
            double velOperacionalIda, double velOperacionalVolta, double tempoD, double tempoC, double distanciaPerIda,
            double distanciaPerVolta, double jornada, double tDiario, double diasUteis, double manutencao, String tipo,
            double qntd) {
        this.chassi = chassi;
        this.pesoBruto = pesoBruto;
        this.reboque = reboque;
        this.outrosEqui = outrosEqui;
        this.velOperacionalIda = velOperacionalIda;
        this.velOperacionalVolta = velOperacionalVolta;
        this.tempoD = tempoD;
        this.tempoC = tempoC;
        this.distanciaPerIda = distanciaPerIda;
        this.distanciaPerVolta = distanciaPerVolta;
        this.jornada = jornada;
        this.tDiario = tDiario;
        this.diasUteis = diasUteis;
        this.manutencao = manutencao;
        this.tipo = tipo;
        this.qntd = qntd;
    }

    public void contas() {
        double pesoTotal = chassi + reboque + outrosEqui;
        double cargaUtil = pesoBruto - pesoTotal;
        double viagensMensais = qntd / 30;
        double tempoIda = distanciaPerIda / velOperacionalIda * 60;
        double tempoVolta = distanciaPerVolta / velOperacionalVolta * 60;
        double totalViagem = tempoIda + tempoVolta + tempoD + tempoC;
        double tempoDiaOperacao = tDiario * jornada * 60;
        double viagensDia = tempoDiaOperacao / totalViagem;
        double diasDisponiveiMes = diasUteis - manutencao;
        double viagensMensaisVeiculo = viagensDia * diasDisponiveiMes;
        double frotaNecessaria = Math.ceil(viagensMensais / viagensMensaisVeiculo);

        System.out.println("Peso total: " + pesoTotal);
        System.out.println("Carga útil: " + cargaUtil);
        System.out.println("Viagens Mensais: " + viagensMensais);
        System.out.println("Tempo de ida: " + tempoIda);
        System.out.println("Tempo de volta: " + tempoVolta);
        System.out.println("Total da viagem: " + totalViagem);
        System.out.println("Tempo Diario de operação : " + tempoDiaOperacao);
        System.out.println("Número de viagens de um veículo por dia : " + viagensDia);
        System.out.println("Calculo do número total de dias disponíveis por mês: " + diasDisponiveiMes);
        System.out.println("Número de viagens mensais de um veículo: " + viagensMensaisVeiculo);
        System.out.println("Tipo da carga: " + tipo);
        System.out.println("Frota Necessária: " + frotaNecessaria);
    }

}
