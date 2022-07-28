package uebungen.b_juni.j_cointoss;

public class Coin {

    public static CoinSide toss() {
        if (Math.random() > 0.5) {
            return CoinSide.HEADS;
        } else {
            return CoinSide.TAILS;
        }
    }
}
