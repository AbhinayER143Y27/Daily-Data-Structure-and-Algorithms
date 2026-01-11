package ArrayList;

public class JumpGame {public boolean canJump(int[] nums) {
    int last = nums.length - 1;
    int current = 0;
    int maxReach = 0;
    for(int i = 0; i < nums.length; i++)
    {
        if(i > maxReach)
        {
            return false;
        }
        int currentReach = i + nums[i];
        maxReach = Math.max(maxReach,currentReach);
        if(maxReach >= last)
        {
            return true;
        }
    }
    return false;
}
}
