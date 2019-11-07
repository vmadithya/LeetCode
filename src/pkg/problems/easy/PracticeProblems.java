package pkg.problems.easy;

final public class PracticeProblems {
	private int i;
	public PracticeProblems(int i) {
		this.i = i;
	}
	public PracticeProblems modify(int i) {
		if (this.i == i) {
			return this;
		}
		else {
			return new PracticeProblems(i);
		}
	}

	public static void main(String[] args) {
		PracticeProblems p = new PracticeProblems(10);
		PracticeProblems m = p.modify(11);
		
		PracticeProblems l = p.modify(10);
		
		System.out.println(p==l);
		
		System.out.println(p==m);
		
		
	}

}
