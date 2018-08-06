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
		int res = 0;
		boolean chgFlag = false;
		for (char move : moves.toCharArray()) {
			switch (move) {
			case 'U':
				res++;
				chgFlag = true;
				break;
			case 'D':
				res--;
				chgFlag = true;
				break;
			case 'R':
				res++;
				chgFlag = true;
				break;
			case 'L':
				res--;
				chgFlag = true;
				break;
			}
		}
		if (res == 0 && chgFlag)
			return true;

		return false;

	}

	public static void main(String[] args) {
		JudgeRouteCircle_657 jrc = new JudgeRouteCircle_657();
		
		System.out.println(jrc.judgeCircle("UD"));
		
		System.out.println(jrc.judgeCircle("LL"));
		

	}

}
