package pkg.problems.easy;

/**
 * Initially, there is a Robot at position (0, 0). Given a sequence of its
 * moves, judge if this robot makes a circle, which means it moves back to the
 * original place.
 * 
 * The move sequence is represented by a string. And each move is represent by a
 * character. The valid robot moves are R (Right), L (Left), U (Up) and D
 * (down). The output should be true or false representing whether the robot
 * makes a circle.
 * 
 * Example 1: Input: "UD" Output: true Example 2: Input: "LL" Output: false
 *
 */
public class JudgeRouteCircle_657 {

	public boolean judgeCircle(String moves) {
		int vres = 0,  hres= 0;
		for (char move : moves.toCharArray()) {
			switch (move) {
			case 'U':
				vres++;
				break;
			case 'D':
				vres--;
				break;
			case 'R':
				hres++;
				break;
			case 'L':
				hres--;
				break;
			}
		}
		if (vres == 0 && hres == 0)
			return true;

		return false;

	}

	public static void main(String[] args) {
		JudgeRouteCircle_657 jrc = new JudgeRouteCircle_657();
		
		System.out.println(jrc.judgeCircle("UD"));
		
		System.out.println(jrc.judgeCircle("LL"));
		
		System.out.println(jrc.judgeCircle("UL"));
		
		System.out.println(jrc.judgeCircle("ULDL"));
		

	}

}
