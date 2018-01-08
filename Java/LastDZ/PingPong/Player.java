package LastDZ.PingPong;


public class Player extends Thread{

   protected final long timeMillis;
   protected final String word;
    protected Ball ball;

    public Player(long timeMillis, String word) {
        this.timeMillis = timeMillis;
        this.word = word;
    }

    public void startPlay() throws InterruptedException {
        while (true){
            Thread firstPlayer = new Player(1000, "Ping");

            firstPlayer.sleep(1000);
            System.out.println("Ping");


            Thread secondPlayer = new Player(1500, "Pong");

            secondPlayer.sleep(1500);
            System.out.println("Pong");
        }
    }

    @Override
    public void run() {
        try {
            startPlay();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
