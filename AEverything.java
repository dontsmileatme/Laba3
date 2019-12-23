public abstract class AEverything {
    String name;

    public AEverything(String name){
        this.name = name;
    }

    public String getName(){
        return "Объект " + "\"" + this.name + "\"";
    }


    @Override
    public String toString(){
        return "Созданный объект: " + "\"" + this.name + "\"";
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        AEverything t = (AEverything) obj;
        return (this.name == t.name) ? true : false;
    }
}
