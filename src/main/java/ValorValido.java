public class ValorValido {
    public boolean istoEUmValorValido(double valor) throws Exception {
        if (valor > 0){
            if(valor <= 7000){
                return true;
            } else {
                throw new Exception("Valores acima de 7000 são proibidos");
            }
        }
        throw new Exception("Valores abaixo de 0,01 são proibidos");
    }
}
