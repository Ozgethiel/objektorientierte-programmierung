package uebungen.b_juni.j_cointoss;

public class Main {

    public static void main(String[] args) {
        // FIXME: Erstellen Sie 2 Klassen und eine Enumeration:
        //  1. Eine Enum CoinSide mit den beiden Werten HEADS und TAILS.
        //  2. Eine Klasse Player. Ein Player hat ein int Attribut mit dem Namen money und ein Attribut vom Typ CoinSide mit
        //     dem Namen bet. Diese Attribute werden per Konstruktor gesetzt. Das Attribut bet kann mit der Methode getBet
        //     abgerufen werden. Außerdem hat ein Player zwei Methoden ohne Rückgabetyp (void): giveMoney und receiveMoney.
        //     giveMoney akzeptiert einen Parameter vom Typ Player. receiveMoney akzeptiert keinen Parameter. giveMoney
        //     verringert das money Attribut um 1 und ruft die receiveMoney Methode des übergebenen Spielers auf. Die
        //     receiveMoney Methode erhöht das money Attribut um 1. Mit einer getMoney kann man auf den Wert des Money
        //     Attributes zugreifen.
        //  3. Eine Klasse Coin. Die Klasse hat keine Felder. Sie hat eine Methode toss mit dem Rückgabetyp CoinSide.
        //     Per Zufall (Math.random()) wird in dieser Methode eine Seite ermittelt und zurückgegeben.
        //  In dieser main Methode sollen 2 Player und ein Münze erzeugt werden. Ein Player wettet immer auf HEADS, die andere
        //  immer auf TAILS. Beide haben zu Beginn 100 Euro. Die beiden Player spielen 10 mal. In jedem Spiel wird zuerst die
        //  toss Methode der Coin Instanz aufgerufen. Dann wird der Sieger ermittelt. Der Verlierer zahlt dem Gewinner 1 Euro
        //  mithilfe der giveMoney Methode. Geben Sie nach jedem Spiel den Sieger aus und wie viel Geld jeder Spieler noch hat.
        //  Fortgeschritten: Geht das auch mit mehr als nur 2 Spielern?

        Player heads = new Player(100, CoinSide.HEADS);
        Player tails = new Player(100, CoinSide.TAILS);

        for (int i = 0; i < 10; i++) {
            CoinSide up = Coin.toss();
            Player winner;
            Player loser;
            if  (heads.getBet() == up) {
                winner = heads;
                loser = tails;
            } else {
                winner = tails;
                loser = heads;
            }
            System.out.println("Round " + i + ":");
            System.out.println("Winner is " + winner.getBet());
            loser.giveMoney(winner);

            System.out.println("Player heads now has " + heads.getMoney() + " €");
            System.out.println("Player tails now has " + tails.getMoney() + " €");
            System.out.println();
        }
    }
}
