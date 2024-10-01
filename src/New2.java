
class  A{
    void show(){
        for (int i = 1; i <=10; i++)  {
           try{
               if(i == 6){
                   Thread.sleep(4000);
               }
               System.out.println(i);
           }
           catch (Exception e){
               System.out.println(i);
           }


        }
    }
}


public class New2 {
    public static void main(String[] args) {
        A n = new A();
        n.show();
    }
}
