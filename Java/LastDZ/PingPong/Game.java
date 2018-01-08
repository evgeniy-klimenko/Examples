package LastDZ.PingPong;


public class Game {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Thread firstPlayer = new Player(1000, "Ping");
        Thread secondPlayer = new Player(1500, "Pong");

        firstPlayer.run();
        secondPlayer.run();
    }
}
