package JavaPrograms.threads;

class Message {

    /*synchronized void printMessage(String message){
        System.out.println(message);
    } The other way aroung method synchronizing*/
    void printMessage(String message){

        System.out.println(message);
    }
}

class Syncedclass extends Thread{
    Message messageref;
    String texts;
    Syncedclass(Message message, String text){
        messageref = message;
        texts=text;
    }
    @Override
    public void run() {
        messageref.printMessage(texts);
      /*  synchronized (this){
            messageref.printMessage(texts);
        } Other way of synchronizing in which we are using synchronized keyword which applies lock
        and only one thread process*/
    }
}

public class Sender{

    public static void main(String[] args) {
        Message message = new Message();
        Thread thread = new Thread(new Syncedclass(message,"Hi! How are you ?"));
        Thread thread1 = new Thread(new Syncedclass(message,"Bye! Get Lost"));
        thread.start();
        thread1.start();
        /*try { One way for synchronization
            thread.join();
        }
        catch(Exception e){

        }*/

    }
}