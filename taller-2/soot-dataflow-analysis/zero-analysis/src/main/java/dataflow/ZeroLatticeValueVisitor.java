package dataflow;

import static dataflow.abs.ZeroLattice.MAYBE_ZERO;
import static dataflow.abs.ZeroLattice.NOT_ZERO;
import static dataflow.abs.ZeroLattice.ZERO;

import java.util.Map;

import dataflow.abs.ZeroLattice;
import dataflow.utils.AbstractValueVisitor;
import dataflow.utils.ValueVisitor;
import soot.Local;

public class ZeroLatticeValueVisitor extends AbstractValueVisitor<ZeroLattice> {
	
	private final Map<String, ZeroLattice> variables;
	private ZeroLattice resolvedValue = ZeroLattice.BOTTOM;
	private Boolean possibleDivisionByZero;
	
	public ZeroLatticeValueVisitor(Map<String, ZeroLattice> variables) {
		this.variables = variables;
		this.possibleDivisionByZero = false;
	}
	
	@Override
	public void visitLocal(Local variable) {
		resolvedValue = variables.get(variable.getName());
	}
	
	@Override
	public void visitDivExpression(ZeroLattice leftOperand, ZeroLattice rightOperand) {
		resolvedValue = leftOperand.divideBy(rightOperand);
		possibleDivisionByZero = rightOperand != ZeroLattice.NOT_ZERO;
	}
	
	
	@Override
	public void visitMulExpression(ZeroLattice leftOperand, ZeroLattice rightOperand) {
		resolvedValue = leftOperand.multiplyBy(rightOperand);
	}
	
	@Override
	public void visitSubExpression(ZeroLattice leftOperand, ZeroLattice rightOperand) {
		resolvedValue = leftOperand.substract(rightOperand);
	}
	
	@Override
	public void visitAddExpression(ZeroLattice leftOperand, ZeroLattice rightOperand) {
		resolvedValue = leftOperand.add(rightOperand);
	}
	
	@Override
	public void visitIntegerConstant(int value) {
		resolvedValue = value == 0
			? ZeroLattice.ZERO
			: ZeroLattice.NOT_ZERO;
	}
	
	@Override
	public ZeroLattice done() {
		return resolvedValue;
	}
	
	@Override
	public ValueVisitor cloneVisitor() {
		return new ZeroLatticeValueVisitor(variables);
	}
	
	public Boolean getPossibleDivisionByZero() {
		return possibleDivisionByZero;
	}
}
