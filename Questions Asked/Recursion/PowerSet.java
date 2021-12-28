public class PowerSet{

  public static void main(String[] args) {
    PowerSet power = new PowerSet();
    power.checkPowerSet("ab",0,"");
  }

  private static void checkPowerSet(String s, int i , String current){

    if(i == s.length()){
      System.out.println(current);
      return ;
    }

    checkPowerSet(s,i+1, current + s.charAt(i));
    System.out.println(s + " "  + i + " " + current);
    checkPowerSet(s,i+1, current);
  }
}
