package Inheritan_Overriding;

public class Games_13_4 {
    public static void main(String[] args) {
        Game[] games = new Game[2];
        games[0] = new ActionGame("Game 1", 5.00);
        games[1] = new PuzzleGame("Game 2", 9.00);

        double totalPrice = calculateTotalPrice(games);
        System.out.println("Total price of the games: $" + totalPrice);
    }

    public static double calculateTotalPrice(Game[] games) {
        double total = 0;
        for (Game game : games) {
            total += game.getPrice();
        }
        return total;
    }
}

class Game {
    String title;
    double price;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class ActionGame extends Game {
    public ActionGame(String title, double price) {
        super(title, price);
    }
}

class PuzzleGame extends Game {
    public PuzzleGame(String title, double price) {
        super(title, price);
    }
}