
public final class Range {
  private final MyNumber start;
  private final MyNumber end;

  /**
   * @param start
   *            the beginning of the range
   * @param end
   *            the end of the range; must not precede start
   * @throws IllegalArgumentException
   *             if start is after end
   * @throws NullPointerException
   *             if start or end is null
   */
  public Range(MyNumber start, MyNumber end) {
    if (start.getNum().compareTo(end.getNum()) > 0)
      throw new IllegalArgumentException(start + " after " + end);
    this.start = start;
    this.end = end;
  }

  // Repaired constructor - makes defensive copies of parameters
  // Stops first attack
  // public Range(MyNumber start, MyNumber end) {
  //   this.start = new MyNumber(start.toString());
  //   this.end = new MyNumber(end.toString());
    
  //   if (this.start.getNum().compareTo(this.end.getNum()) > 0)
  //   throw new IllegalArgumentException(start +" after "+ end);
  // }

  public MyNumber start() {
    return start;
  }

  public MyNumber end() {
    return end;
  }

  // Repaired accessors - make defensive copies of internal fields - Page 186
  // Stops second attack
  // public MyNumber start() {
  //   return new MyNumber(start.toString());
  // }
  //
  // public MyNumber end() {
  //   return new MyNumber(end.toString());
  // }

  public String toString() {
    return start + " - " + end;
  }

  // Remainder omitted
}