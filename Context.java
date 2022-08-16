public class Context {

    private  Strategy strategy;

    Context(Strategy strategy){
       this.strategy = strategy;
    }

    public int executeStrategy(int k, int x, int y){
     return  strategy.doOperation(k, x, y);
    }
}
