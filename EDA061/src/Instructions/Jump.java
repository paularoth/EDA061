package Instructions;

import Computer.Memory;

public class Jump implements Instruction {
	int i;

	public Jump(int i) {
		super();
		this.i = i;
	}

	public void execute(Memory mem) {
		// TODO Auto-generated method stub

	}
	public String toString(){
		return "JMP" + String.valueOf(i);
	}
}
