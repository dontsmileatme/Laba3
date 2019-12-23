public class Human extends AEverything implements Moving, Actions {
    private int age;
    private Size size;

    public Human(String name, Size s, int a) {
        super(name);
        this.size = s;
        this.age = a;
        System.out.println("Создан " + this.getName() + " (возраст: " + a + ", размер: " + s.getTitle() + ")");
    }

    @Override
    public String getName() {
        return "Персонаж " + "\"" + name + "\"";
    }

    public Size getSize() {
        return size;
    }

    public String setSize(Size size) {
        this.size = size;
        return " присвоен размер: " + "\"" + size.getTitle() + "\"";
    }

    @Override
    public void wade(Trees trees) {
        System.out.println(this.getName() + " " + Adverbs.HARDLY.getTitle() + " пробирается через " + trees.getName());
    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " " + Adverbs.EVERYMOMENT.getTitle() + " останавливается");
    }

    @Override
    public void out(Trees trees) {
        System.out.println(this.getName() + " выпутывается из " + trees.getName());
    }

    @Override
    public void getout(Location location) {
        System.out.println(this.getName() + " выбирается на " + "\"" + location.getTitle() + "\"");
    }

    @Override
    public void remember() {
        System.out.print(this.getName() + " " + Adverbs.LUCKILY.getTitle() + "," + " вспомнила, что ");
    }

    @Override
    public void bite(FairyMushroom thisOne, FairyMushroom thatOne, Adverbs ad) {
        System.out.println(this.getName() + " " + ad.getTitle() + " стала откусывать то " + thisOne.getName() + ", то " + thatOne.getName());
        System.out.println("Для " + this.getName() + " сначала" + this.setSize(Size.TALL) + ", затем" + this.setSize(Size.SHORT));
    }


    public void toBecomeNormal() {
        if (this.getSize().equals(Size.NORMAL)) {
            System.out.println(this.getName() + " нормального размера");
        } else {
            this.setSize(Size.NORMAL);
            System.out.println("И " + Adverbs.EVENTUALLY.getTitle() + " " + this.getName() + " стала " + "\"" + Size.NORMAL.getTitle() + "\"");
        }
    }

    @Override
    public String toString() {
        return "Персонаж: " + "\"" + this.name + "\"";
    }

    @Override
    public boolean equals(Object obj){
        Human h = (Human) obj;
        return (this.name == h.name && this.age == h.age && this.size == h.size) ? true : false;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode() + this.size.hashCode() + this.age;
    }
}


