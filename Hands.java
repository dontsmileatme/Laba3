class Hands extends BodyParts {
    public Hands(String name) {
        super(name);
    }

    void hold(AThing thing){
        System.out.println("В " + this.getName() + " остался " + thing.getName());
    }

}
