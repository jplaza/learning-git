
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

  public MyNumber start() {
    return start;
  }

  public MyNumber end() {
    return end;
  }

  public String toString() {
    return start + " - " + end;
  }

}