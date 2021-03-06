package Instructions;

import Computer.*;

public class Add extends Expression {

	public Add(Operand op1, Operand op2, Address a) {
		super(op1, op2, a);
	}

	public void execute(Memory mem, Counter c) {
		a.getWord(mem).add(op1.getWord(mem), op2.getWord(mem));

	}

	public String toString() {
		return "ADD" + " [" + op1.toString() + "] " + op2.toString() + " ["
				+ a.toString() + "]";
	}
}
