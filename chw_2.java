public class chw_2 {
  public static void main(String[] args) {
  try {
    // int n = 10/2; 
    int n = 10/0;
    System.out.println(n); 

  } catch (Exception e) {
    System.out.println("in catch bolck hai ye jabi calata hai ja try me error ki posibility to  ");
  }  
  finally{
    System.out.println("ye to chalega hi chalga");
  }
 
  
  }
}
