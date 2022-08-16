class app{
    public static void main(String[] args) {
        
    Context obj = new Context(new OperationAdd());
  //  System.out.println("Add numbers "+ obj.executeStrategy(5, 5, 5));
     
    Context ob = new Context(new OperationMultiply());
    System.out.println("Mul numbers "+ obj.executeStrategy(5, 5, 5));
    }
}