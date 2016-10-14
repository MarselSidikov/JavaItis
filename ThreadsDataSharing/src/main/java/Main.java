public class Main {
    public static void main(String[] args) {
        BonusCard bonusCard = new BonusCard(150);
        Human husband = new Human(bonusCard, "husband");
        Human wife = new Human(bonusCard, "wife");

        husband.start();
        wife.start();
    }
}
