public interface Moving {
    void wade(Trees trees);  //пробираться
    void stop(); //останавливаться
    void out(Trees trees); //выпутываться
    void getout(Location location); //выбраться
}