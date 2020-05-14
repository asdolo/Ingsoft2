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
	
	private boolean isBottom() {
		return this.equals(ZeroLattice.BOTTOM);
	}

	private boolean isNotZero() {
		return this.equals(ZeroLattice.NOT_ZERO);
	}

	private boolean isZero() {
		return this.equals(ZeroLattice.ZERO);
	}
	
	public ZeroLattice add(ZeroLattice another) {
		// Devolveremos:
		// - ZERO si ambos sumandos son el valor abstracto ZERO
		//    (ya que sabemos que 0 + 0 = 0)
		// - NOT_ZERO si un sumando es el valor abstracto ZERO y el otro sumando es el valor abstracto NOT_ZERO
		//    (ya que, al ser cero el elemento neutro de la suma/resta, al operar con un valor abstracto NOT_ZERO obtendremos el mismo valor abstracto)
		// - MAYBE_ZERO en otro caso

		if (this.isZero() && another.isZero()) {
			return ZeroLattice.ZERO;
		}

		if (this.isZero() && another.isNotZero() || this.isNotZero() && another.isZero()) {
			return ZeroLattice.NOT_ZERO;
		}

		return ZeroLattice.MAYBE_ZERO;
	}
	
	public ZeroLattice divideBy(ZeroLattice another) {
		// Devolveremos:
		// - ZERO si el dividendo es el valor abstracto ZERO y el divisor es el valor abstracto NOT_ZERO
		//    (ya que en este caso el dividendo actúa como valor absorbente y la división se evalúa a cero)
		// - NOT_ZERO si tanto el dividendo como el divisor son el valor abstracto NOT_ZERO
		// - MAYBE_ZERO en otro caso
		//    (cabe destacar que el caso donde el divisor es ZERO cae en este caso. simplemente elijo devolver MAYBE_ZERO como convención)

		if (this.isZero() && another.isNotZero()) {
			return ZeroLattice.ZERO;
		}

		if (this.isNotZero() && another.isNotZero()) {
			return ZeroLattice.NOT_ZERO;
		}

		return ZeroLattice.MAYBE_ZERO;
	}
	
	
	public ZeroLattice multiplyBy(ZeroLattice another) {
		// Devolveremos:
		// - ZERO si ALGUNO de los dos valores abstractos es ZERO
		//    (cero es el elemento absorbente de la multiplicación)
		// - NOT ZERO si AMBOS valores abstractos son NOT_ZERO
		//    (ya que sabemos que dos valores distintos de cero multiplicados dan un valor distinto de cero)
		// - MAYBE_ZERO en otro caso
		
		if (this.isZero() || another.isZero()) {
			return ZeroLattice.ZERO;
		}
		
		if (this.isNotZero() && another.isNotZero()) {
			return ZeroLattice.NOT_ZERO;
		}
		
		return ZeroLattice.MAYBE_ZERO;
	}
	
	public ZeroLattice substract(ZeroLattice another) {
		// Devolveremos:
		// - ZERO si tanto el el minuendo como el sustraendo son el valor abstracto ZERO
		//    (ya que sabemos que 0 - 0 = 0)
		// - NOT_ZERO si uno de los valores abstractos es ZERO y el otro es NOT_ZERO
		//    (ya que, al ser cero el elemento neutro de la suma/resta, al operar con un valor abstracto NOT_ZERO obtendremos el mismo valor abstracto)
		// - MAYBE_ZERO en otro caso
		
		if (this.isZero() && another.isZero()) {
			return ZeroLattice.ZERO;
		}
		
		if (this.isZero() && another.isNotZero() || this.isNotZero() && another.isZero()) {
			return ZeroLattice.NOT_ZERO;
		}
		
		return ZeroLattice.MAYBE_ZERO;
	}
	
	public ZeroLattice supreme(ZeroLattice another) {
		
		// Seguro que el otro valor es mayor o,
		// en el peor caso, es BOTTOM también
		if (this.isBottom()) {
			return another;
		}
		
		if (another.isBottom()) {
			return this;
		}
		
		// Si son iguales, devuelvo cualquiera de ellos
		if (this.equals(another)) {
			return this;
		}
		
		return ZeroLattice.MAYBE_ZERO;
	}
}
