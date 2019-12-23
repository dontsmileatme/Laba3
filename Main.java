public class Main {
    public static void main(String[] args){
        Human alice = new Human("Алиса", Size.NORMAL, 7);
        Trees trees = new Trees("Деревья");
        alice.wade(trees);
        Branches branches = new Branches("Ветки");
        BodyParts neck = new BodyParts("Шея");
        neck.makeOwner(alice);
        neck.setCondition(Condition.NEW);
        neck.cling(branches);
        alice.stop();
        alice.out(trees);
        Hands hands = new Hands("Руки");
        hands.makeOwner(alice);
        FairyMushroom pieces = new FairyMushroom("Кусочки волшебного гриба");
        alice.remember();
        hands.hold(pieces);
        alice.getout(Location.FREEPLACE);
        FairyMushroom thisOne = new FairyMushroom("Этот Кусочек");
        FairyMushroom thatOne = new FairyMushroom("Тот Кусочек");
        alice.bite(thisOne, thatOne, Adverbs.WITHTHEGREATESTCARE);
        alice.toBecomeNormal();
    }
}
