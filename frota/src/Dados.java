public class Dados {
    // Dados veiculo
    private double chassis;
    private double pesoBruto;
    private double roboque;
    private double outrosEquipamentos;
    private double velocidadeOperacionalIda;
    private double velocidadeOperacionalVolta;

    // Dados operacionais
    private double tempoDescarga;
    private double tempoCarga;
    private double distanciaPerIda;
    private double distanciaPerVolta;
    private double jornada;
    private double tempoDiario;
    private double diasUteis;
    private double manutencao;

    // Dados da carga
    private String tipo;
    private double quantidadeCarga;

    public Dados ( double chassis , double pesoBruto, double roboque, double outrosEquipamentos, double velocidadeOperacionalIda, double velocidadeOperacionalVolta,double tempoDescarga,double tempoCarga,double distanciaPerIda ,double distanciaPerVolta, double jornada, double tempoDiario,double  diasUteis, double manutencao, String tipo, double quantidadeCarga){
         this.chassis=chassis;
        this.pesoBruto=pesoBruto;
        this.roboque=roboque;
        this.outrosEquipamentos=outrosEquipamentos;
        this.velocidadeOperacionalIda=velocidadeOperacionalIda;
        this.velocidadeOperacionalVolta=chassis;

        this.tempoDescarga=tempoDescarga;
        this.tempoCarga=tempoCarga;
        this.distanciaPerIda=distanciaPerIda;
        this.distanciaPerVolta=distanciaPerVolta;
        this.jornada=jornada;
        this.tempoDiario=tempoDiario;
        this.diasUteis=diasUteis;
        this.manutencao=manutencao;

        this.tipo=tipo;
        this.quantidadeCarga=quantidadeCarga;
    }

    public void contas(){
        
       

        double pesoTotal = chassis + roboque + outrosEquipamentos;

        double cargaUtil = pesoBruto - pesoTotal;

        double viagensMensais = quantidadeCarga / 30;

        double tempoIda = distanciaPerIda / velocidadeOperacionalIda * 60;
        double tempoVolta = distanciaPerVolta / velocidadeOperacionalVolta * 60;

        double totalViagem = tempoIda + tempoVolta + tempoDescarga + tempoCarga;

        double tempoDiaOperacao = tempoDiario + jornada;

        double viagensDia = tempoDiaOperacao / totalViagem;

        double diasDisponiveisMes= diasUteis - manutencao;

        double viagensMensaisVeiculo = viagensDia * viagensMensais;

        double frotaNecessaria = viagensMensais /viagensMensaisVeiculo;
        

         System.out.println(frotaNecessaria);
    }


}
