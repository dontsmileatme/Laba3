public class BodyParts extends AThing implements ThingActions{
    private Condition condition;
    private Human Owner;
    public BodyParts(String name) {
        super(name);
        System.out.println("Создана " + this.getName());
    }

    public String getName() {
        return "Часть тела \"" + name + "\"";
    }

    public Condition getCondition(){
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
        System.out.println(this.getName() + " присвоено свойство \"" + condition.getTitle() + "\"");
    }

    public void cling(Branches branches){
        System.out.println(this.toString() + " зацепилась за " + branches.getName());
    }

    public void makeOwner(Human human){
        this.Owner = human;
        System.out.println(this.getName() + " принадлежит " + human.getName());
    }

    @Override
    public String toString(){
        return this.getCondition().getTitle()+ " " + this.getName();
    }
}
