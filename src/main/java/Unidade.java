public class Unidade {
    public boolean istoEhUnidade(int valor){
        boolean ehUnidade = false;
        if(valor <= 9){
            ehUnidade = true;
        }
        return ehUnidade;
    }
}
