package apps;

public  class MsnMessenger extends ServicoMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
