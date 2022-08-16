public class OperationAdd implements Strategy{

    @Override
    public int doOperation(int k, int x, int y) {
       
        return (k+x+y);
    }



}