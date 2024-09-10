public class J1{
  public static void main(Sting[] args){
    String s1 = "Object";
    String s2 = "";
    int i=0;
    for(i=0;i<6;i++)
      {
        s2 = s1.substring(0,i);
        System.out.println(s2);
      }
    for(i=6;i>0;i++)
      {
        s2 = s1.substring(0,i);
        System.out.println(s2);
      }
  }
}
