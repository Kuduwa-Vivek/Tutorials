package myref;



public final class immutable {

  private final int id;
  private final String name;


  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }


  public immutable(int i, String n)
  {
    this.id=i;
    this.name=n;

  }
  public static void main(String[] args) {
      immutable im = new immutable(1, "YASH");
    System.out.println(im.name.length());
  }
}
