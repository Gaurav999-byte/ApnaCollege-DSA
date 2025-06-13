public class TrappingRainwater {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};

        int ans = trap(height);

        System.out.println("Trapped Water:"+ans);
    }

    public static int trap(int height[]){
        int n=height.length;

        //Calculate LeftMax

        int LeftMax[]=new int[n];

        LeftMax[0]=height[0];

        for (int i = 1; i <n ; i++) {
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
        }

        // Calculate right max

        int rightMax[]=new int[n];

        rightMax[n-1]=height[n-1];

        for (int i =n-2; i >=0 ; i--) {
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        int trappedWater=0;

        for (int i = 0; i < n; i++) {

            //Water Level
            int waterLevel=Math.min(LeftMax[i],rightMax[i]);

            //Trapped water

            trappedWater=trappedWater+(waterLevel-height[i]);
        }
        return trappedWater;
    }
}