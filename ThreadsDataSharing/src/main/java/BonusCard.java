public class BonusCard {
    private int bonuses;

    public int getBonuses() {
        return this.bonuses;
    }

    public BonusCard(int bonuses) {
        this.bonuses = bonuses;
    }

    public synchronized boolean use(int n) {
        if (bonuses >= n) {
            bonuses = bonuses - n;
            System.out.println(bonuses + " left");
            return true;
        } else {
            System.out.println("OOOOOPS");
            return false;
        }
    }
}
