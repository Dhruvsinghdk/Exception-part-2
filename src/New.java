public class New {
    public static void main(String[] args) {
        int amt = 9000;
        int withd = 10000;

        try{
        if(amt<withd){
            throw new ArithmeticException("Isufficent balance");           // to define own exception use throw else use throws
            }
        }
        catch (Exception e){
//            e.printStackTrace();
            System.out.println(e);
            System.out.println("program continues..");
        }


    }
}
