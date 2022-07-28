package uebungen.b_juni.j_cointoss;

public class Player {

    private int money;
    private CoinSide bet;

    public Player(int money, CoinSide bet) {
        this.money = money;
        this.bet = bet;
    }

    public void giveMoney(Player other) {
        money--;
        other.receiveMoney();
    }

    public void receiveMoney() {
        money++;
    }

    public int getMoney() {
        return money;
    }

    public CoinSide getBet() {
        return bet;
    }
}
