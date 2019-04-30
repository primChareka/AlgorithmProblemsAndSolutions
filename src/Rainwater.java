/**
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it is able to trap after raining.
 * Example :
 * 
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 *                      __
 *          __         |  |__    __
 * 	  __   |  |**|**|**|     |**|  |__
 * __|  	|**|     |**|                 |
 **/
public class Rainwater {
	public static int trap(int[] height, int start) {
		int volume = 0;
		int temp = 0;
		int next = start;
		int nextVal=0;
		int startVal=0;
		
		while (next < height.length) {

			while (next < height.length&&height[next] < height[start]) {
				temp += height[start] - height[next];
				next++;
			}
			
			if(next!=height.length) {
				//Make sure a right wall was found before adding to sum 
				//otherwise go back and restart from next position
				volume +=temp;
				temp = 0;
				start = next;
			}else {
				temp = 0;
				start++;
				next=start;
			}
				next++;
		}
		
		return volume;
	}

	public static void main(String args[]) {
		int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(array, 0));//should be 6
		
		int[] array1 = {0,1,0,2,1,0,1,3,2,1,1,3};
		System.out.println(trap(array1, 0));//should be 10
		
		int[] array3 = {1,0,1}; //should be 1
		System.out.println(trap(array3, 0));

	}
}