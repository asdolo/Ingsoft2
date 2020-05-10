package dataflow.abs;

/**
 * Lattice used in the DivisionByZeroAnalysis.
 */
public enum ZeroLattice {

  BOTTOM("bottom"), NOT_ZERO("not-zero"), ZERO("zero"), MAYBE_ZERO("maybe-zero");

  private String name;

  @Override
  public String toString() {
    return this.name;
  }

  ZeroLattice(String name) {
    this.name = name;
  }

  public ZeroLattice add(ZeroLattice another) {

    throw new UnsupportedOperationException();
  }
  

  public ZeroLattice divideBy(ZeroLattice another) {
    throw new UnsupportedOperationException();
  }
  

  public ZeroLattice multiplyBy(ZeroLattice another) {
    throw new UnsupportedOperationException();
  }
  

  public ZeroLattice substract(ZeroLattice another) {
    throw new UnsupportedOperationException();
  }
  

  public ZeroLattice supreme(ZeroLattice another) {
    throw new UnsupportedOperationException();
  }
  
}
