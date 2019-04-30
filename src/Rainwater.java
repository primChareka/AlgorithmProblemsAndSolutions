
public class Rainwater {
	    public static int trap(int[] height, int start){
	        //first is index of max, values
	           int[] max = new int[]{start,0};
	           int currentHeight =0;
	            int  dif=0;
	             boolean leftEdge = false;
	             int volume =0;

	        int i=0;

	        for(i=start;i<height.length;i++){
	            currentHeight = height[i];
	            if(currentHeight>=max[1]){
	                max[0]=i;
	                max[1] = currentHeight;
	                if(!leftEdge){
	                    leftEdge = true;
	                }else{
	                    volume+=dif;
	                    dif=0;
	                    leftEdge=false;
	                }
	            }else if(currentHeight<max[1]){
	                     dif+=max[1]-currentHeight;

	            }//end if
	        }//end for

	        if(max[0]<=height.length-1)
	            volume+=trap(height,max[0]+1);
	        return volume;
	    }

	    public static void main(String args[]) {
	        int[] array = {0,1,0,2,1,0,1,3,2,1,2,3};
	        System.out.println(trap(array, 0));

	    }
	}