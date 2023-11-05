abstract class Shop{
abstract void displayTimings();
}

class Medical extends Shop{
    void displayTimings(){
     System.out.println("Medical Shop Timings :  Open 24 * 7 \n\n\n" );
    }
}
class Grocery extends Shop{
    void displayTimings(){
     System.out.println("Grocery Shop Timings : \n MONDAY to SATURDAY : 9 a.m to 9 p.m \n\n\n" );
    }
}
class Laundry extends Shop{
   void displayTimings(){
    System.out.println("Laundry Shop Timings : \nMONDAY to SATURDAY : \n Morning : 9 am to 12 am    Evening : 4pm to 7pm \n\n\n" );
   }
}

class Abstract {
    public static void main(String[] args){
      Shop m =new Medical();
      Shop g=new Grocery();
      Shop l=new Laundry();
      m.displayTimings();
      g.displayTimings();
      l.displayTimings(); 
    }
}
