public enum Adverbs {
    HARDLY("с большим трудом"),
    ALLTHETIME("всё время"),
    EVERYMOMENT("поминутно"),
    LUCKILY("К счастью"),
    WITHTHEGREATESTCARE("с величайшей осторожностью"),
    EVENTUALLY("в конце концов");

    private String title;

    Adverbs(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
