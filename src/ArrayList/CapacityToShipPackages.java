package ArrayList;

public class CapacityToShipPackages {public int shipWithinDays(int[] weights, int days) {
    int high = 0;
    int low = 0;
    for(int w : weights)
    {
        high += w;
        low = Math.max(w,low);
    }

    while(low <= high)
    {
        int counter = 1;
        int sum = 0;
        int mid = low + (high - low)/2;
        for(int i = 0; i < weights.length; i++)
        {
            if(weights[i] + sum <= mid)
            {
                sum += weights[i];
            }
            else if(weights[i] + sum > mid)
            {
                counter++;
                sum = weights[i];
            }
        }
        if(counter > days)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
    return low;
}
}
