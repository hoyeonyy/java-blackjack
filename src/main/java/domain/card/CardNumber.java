package domain.card;

public enum CardNumber {

    ACE("A", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("J", 10),
    QUEEN("Q", 10),
    KING("K", 10);

    final String number;
    final int score;

    CardNumber(String number, int score) {
        this.number = number;
        this.score = score;
    }

    public int getCardNumber() {
        return this.score;
    }

    public boolean isAce() {
        return this.number == ACE.number;
    }

    public int getAdditionalAceScore() {
        return 10;
    }
}
