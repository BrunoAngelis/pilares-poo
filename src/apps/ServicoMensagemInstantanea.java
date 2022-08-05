package apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet(){
        System.out.println("Validando conexção com a internet");
    }

    protected void salvarHistorico(){
        System.out.println("Salvando historico de mensagens");
    }
}
