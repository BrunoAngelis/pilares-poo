import apps.FacebookMessenger;
import apps.MsnMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorMiguelzinho {
    public static void main(String[] args) {
       ServicoMensagemInstantanea smi = null;

       String appEscolhido = "msn";

       if(appEscolhido.equals("msn")){
           smi = new MsnMessenger();
       } else if (appEscolhido.equals("facebook")) {
           smi = new FacebookMessenger();
       }else if (appEscolhido.equals("telegram")){
           smi = new Telegram();
       }

       smi.enviarMensagem();


    }
}
