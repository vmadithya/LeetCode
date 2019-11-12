package pkg.leetcode.problems.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/********
 * 
 * There is a robot starting at position (0, 0), the origin, on a 2D plane.
 * Given a sequence of its moves, judge if this robot ends up at (0, 0) after it
 * completes its moves.
 * 
 * The move sequence is represented by a string, and the character moves[i]
 * represents its ith move. Valid moves are R (right), L (left), U (up), and D
 * (down). If the robot returns to the origin after it finishes all of its
 * moves, return true. Otherwise, return false.
 * 
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make
 * the robot move to the right once, "L" will always make it move left, etc.
 * Also, assume that the magnitude of the robot's movement is the same for each
 * move.
 * 
 * Example 1:
 * 
 * Input: "UD" Output: true Explanation: The robot moves up once, and then down
 * once. All moves have the same magnitude, so it ended up at the origin where
 * it started. Therefore, we return true.
 * 
 * 
 * Example 2:
 * 
 * Input: "LL" Output: false Explanation: The robot moves left twice. It ends up
 * two "moves" to the left of the origin. We return false because it is not at
 * the origin at the end of its moves.
 *
 */

public class RobotReturnOrigin_657 {

	public boolean judgeCircle(String moves) {

		// Count individual L,R,U,D chars movements

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : moves.toCharArray()) {
			if (hm.containsKey(c)) {
				hm.put(c, (hm.get(c) + 1));
			} else {
				hm.put(c, 1);
			}
		}

		if (hm.get('L') == hm.get('R') && hm.get('U') == hm.get('D'))
			return true;

		return false;

	}

//	public boolean judgeCircle(String moves) {
//    	int UD=0;
//    	int LR=0;
//    	for(int i=0;i<moves.length();i++) {
//    		char current=moves.charAt(i);
//    		if(current =='U') {
//    			UD++;
//    		}
//    		else if(current=='D') {
//    			UD--;
//    		}
//    		else if(current=='L') {
//    			LR--;
//    		}else {
//    			LR++;
//    		}
//    	}
//		return UD==0&&LR==0;
//        
//    }

	public static void main(String[] args) {
		RobotReturnOrigin_657 rr = new RobotReturnOrigin_657();

		String input1 = "LL";
		String input2 = "UD";
		String input3 = "ULDDLLDLRDUUUURULRURRRRLRULRLULLLRRULULDDRDLRULDRRULLUDDURDLRRUDRUDDURLLLUUDULRUDRLURRDRLLDDLLLDLRLLRUUDUURDRLDUDRUDRLUDULRLUDRLDDUULDDLDURULUDUUDDRRDUURRLRDLDLRLLDRRUUURDLULLURRRRDRRURDUURDLRRUULRURRUULULUUDURUDLRDDDDDURRRLRUDRUULUUUULDURDRULLRRRUDDDUUULUURRDRDDRLLDRLDULDLUUDRDLULLDLDDRUUUUDDRRRDLLLLURUURLRUUULRDDULUULUURDURDDDRRURLURDLLLRLULRDLDDLRDRRRRLUURRRRLDUDLLRUDLDRDLDRUULDRDULRULRRDLDLLLUDLDLULLDURUURRLLULUURLRLRDUDULLDURRUDDLDDLLUDURLLRLDLDUDLURLLDRRURRDUDLDUULDUDRRUDULLUUDURRRURLULDDLRRURULUURURRDULUULDDDUUDRLDDRLULDUDDLLLDLDURDLRLUURDDRLUDRLUDLRRLUUULLDUUDUDURRUULLDDUDLURRDDLURLDRDRUDRLDDLDULDRULUDRRDRLLUURULURRRUDRLLUURULURRLUULRDDDRDDLDRLDRLDUDRLDRLDDLDUDDURUDUDDDLRRDLUUUDUDURLRDRURUDUDDRDRRLUDURULDULDDRLDLUURUULUDRLRLRLLLLRLDRURRRUULRDURDRRDDURULLRDUDRLULRRLLLDRLRLRRDULDDUDUURLRULUUUULURULDLDRDRLDDLRLURRUULRRLDULLUULUDUDRLDUDRDLLDULURLUDDUURULDURRUURLRDRRRLDDULLLLDDRRLRRDRDLRUDUUDLRLDRDRURULDLULRRDLLURDLLDLRDRURLRUDURDRRRULURDRURLDRRRDUDUDUDURUUUUULURDUDDRRDULRDDLULRDRULDRUURRURLUDDDDLDRLDLLLLRLDRLRDRRRLLDRDRUULURLDRULLDRRDUUDLURLLDULDUUDLRRRDDUDRLDULRDLLULRRUURRRURLRRLDDUDDLULRUDULDULRDUDRLRDULRUUDDRUURUDLDRDUDDUULLUDDLLRLURURLRRULLDDDLURDRRDLLLLULLDLUDDLURLLDDRLDLLDDRDRDDUDLDURLUUUUUDLLLRLDULDDRDDDDRUDLULDRRLLLDUUUDDDRDDLLULUULRRULRUDRURDDULURDRRURUULDDDDUULLLURRRRDLDDLRLDDDRLUUDRDDRDDLUDLUUULLDLRDLURRRLRDRLURUURLULLLLRDDLLLLRUDURRLDURULURULDDRULUDRLDRLLURURRRDURURDRRUDLDDLLRRDRDDLRLRLUDUDRRUDLLDUURUURRDUDLRRLRURUDURDLRRULLDLLUDURUDDRUDULLDUDRRDDUDLLLDLRDRUURLLDLDRDDLDLLUDRDDRUUUDDULRUULRDRUDUURRRURUDLURLRDDLUULRDULRDURLLRDDDRRUDDUDUDLLDDRRUUDURDLLUURDLRULULDULRUURUDRULDRDULLULRRDDLDRDLLLDULRRDDLDRDLLRDDRLUUULUURULRULRUDULRULRUURUDUUDLDUDUUURLLURDDDUDUDLRLULDLDUDUULULLRDUDLDRUDRUULRURDDLDDRDULRLRLRRRRLRULDLLLDDRLUDLULLUUDLDRRLUDULRDRLLRRRULRLRLLUDRUUDUDDLRLDRDDDDRDLDRURULULRUURLRDLLDDRLLRUDRRDDRDUDULRUDULURRUDRDLRDUUDDLDRUDLLDDLRLULLLRUUDRRRRUULLRLLULURLDUDDURLRULULDLDRURDRLLURRDLURRURLULDLRLDUDLULLLDRDLULDLRULLLUDUDUDUDLDDDDDRDLUDUULLUDRLUURDRLULD";

		System.out.println(rr.judgeCircle(input3));
		System.out.println(rr.judgeCircle(input1));
		System.out.println(rr.judgeCircle(input2));

	}

}
