package uebungen.b_juni.j_cointoss;

public class Main {

    public static void main(String[] args) {
        // FIXME: Erstellen Sie 2 Klassen und eine Enumeration:
        //  1. Eine Enum CoinSide mit den beiden Werten HEADS und TAILS.
        //  2. Eine Klasse Player. Ein Player hat ein int Attribut mit dem Namen money und ein Attribut vom Typ CoinSide mit
        //     dem Namen bet. Diese Attribute werden per Konstruktor gesetzt. Das Attribut bet kann mit der Methode getBet
        //     abgerufen werden. Außerdem hat ein Player zwei Methoden ohne Rückgabetyp (void): giveMoney und receiveMoney.
        //     giveMoney akzeptiert einen Parameter vom Typ Person. receiveMoney akzeptiert keinen Parameter. giveMoney
        //     verringert das money Attribut um 1 und ruft die receiveMoney Methode des übergebenen Spielers auf. Die
        //     receiveMoney Methode erhöht das money Attribut um 1. Mit einer getMoney kann man auf den Wert des Money
        //     Attributes zugreifen.
        //  3. Eine Klasse Coin. Die Klasse hat keine Felder. Sie hat eine Methode toss mit dem Rückgabetyp CoinSide.
        //     Per Zufall (Math.random()) wird in dieser Methode eine Seite ermittelt und zurückgegeben.
        //  In dieser main Methode sollen 2 Personen und ein Münze erzeugt werden. Eine Person wettet immer auf HEADS, die andere
        //  immer auf TAILS. Beide haben zu Beginn 100 Euro. Die beiden Personen spielen 10 mal. In jedem Spiel wird zuerst die
        //  toss Methode der Coin Instanz aufgerufen. Dann wird der Sieger ermittelt. Der Verlierer zahlt dem Gewinner 1 Euro
        //  mithilfe der giveMoney Methode. Geben Sie nach jedem Spiel den Sieger aus und wie viel Geld jeder Spieler noch hat.
        //  Fortgeschritten: Geht das auch mit mehr als nur 2 Spielern?
        Player player1 = new Player(CoinSide.HEADS, 100, "Luke Skywalker");
        Player player2 = new Player(CoinSide.TAILS, 100, "Leia Skywalker");
        Coin coin = new Coin();
        System.out.println(player1.getName() + " bets for " + player1.getBet().name());
        System.out.println(player2.getName() + " bets for " + player2.getBet().name());

        for (int i = 0; i < 10; i++) {
            CoinSide coinSide = coin.toss();
            System.out.println("Coin toss resulted in " + coinSide.name());
            if (coinSide == player1.getBet()) {
                System.out.println(player1.getName() + " wins");
                player2.giveMoney(player1);
            } else {
                System.out.println(player2.getName() + " wins");
                player1.giveMoney(player2);
            }
            System.out.println(player1.getName() + ": " + player1.getMoney()
                    + " " + player2.getName() + ": " + player2.getMoney());
        }
    }
}
