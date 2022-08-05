package apps;

import apps.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo apps.Telegram Messenger");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo apps.Telegram Messenger");
    }
}
