
public class MyNumber {
  private Integer num;

  public MyNumber(Integer n) {
    this.num = n;
  }
  public MyNumber(String n) {
    this.num = Integer.parseInt(n);
  }
  public void setNum(Integer num) {
    this.num = num;
  }
  public Integer getNum() {
    return this.num;
  }
  public String toString() {
    return this.num.toString();
  }
}