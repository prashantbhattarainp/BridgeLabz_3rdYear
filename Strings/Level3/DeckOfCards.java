import java.util.Scanner;

public class DeckOfCards {

    // Suits and Ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};

    // Initialize the deck
    static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle the deck using Fisher-Yates Shuffle
    static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap deck[i] with deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Distribute the deck to players
    static String[][] distributeDeck(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cards cannot be evenly distributed among players!");
            return null;
        }
        int cardsPerPlayer = n / players;
        String[][] distributed = new String[players][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[cardIndex++];
            }
        }
        return distributed;
    }

    // Print the players and their cards
    static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) return;

        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s cards:");
            for (String card : playersCards[i]) {
                System.out.println("  " + card);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize & shuffle deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards to distribute (<= " + deck.length + "): ");
        int n = sc.nextInt();

        if (n > deck.length) {
            System.out.println("Not enough cards in the deck!");
            return;
        }

        String[][] playersCards = distributeDeck(deck, n, players);

        // Print the result
        printPlayersCards(playersCards);
    }
}
