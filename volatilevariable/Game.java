package volatilevariable;

public class Game {
  private static  int count = 0;

  private static class Player extends Thread {
    @Override
    public void run() {
      // Simulate some game events
      for (int i = 1; i <= 100; i++) {
        // Update the counter
        count++;
        System.out.println("Player updated counter: " + count);
      }
    }
  }

  public static void main(String[] args) {
    // Create multiple player threads
    Player player1 = new Player();
    Player player2 = new Player();

    player1.start();
//    player2.start();
  }
}

