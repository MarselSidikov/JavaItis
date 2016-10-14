public class Human  extends Thread {
    private BonusCard bonusCard;

    private String who;

    public Human(BonusCard bonusCard, String who) {
        this.bonusCard = bonusCard;
        this.who = who;
    }

    public void shopping(int bonuses) {
        synchronized (bonusCard) {
            if (bonusCard.getBonuses() >= bonuses) {
                System.out.println(who + "is gonna by something");
                if (bonusCard.use(bonuses)) {
                    System.out.println(who + " bought something");
                } else {
                    System.out.println("Sorry, Honey, no money");
                }
            }
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            shopping(7);
        }
    }
}
