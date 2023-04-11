public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual "+ smartTv.volume);

        smartTv.mudarCanal(13);

        System.out.println("Qual canal? " +smartTv.canal);
        System.out.println("Qual Volume? "+ smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv Desligada? " + smartTv.ligada);

        System.out.println("");
    }
}
