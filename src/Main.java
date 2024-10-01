

public class Main  {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};
       try{
           System.out.println(a[7]);
       }
//       catch (Exception e){
//           System.out.println(e.toString());
//       }
       finally {
           for (int i = 0; i < 6; i++) {
               System.out.println(i);
           };
       }

    }
}