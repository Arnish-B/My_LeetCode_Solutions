class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int max_size = nums1.length + nums2.length;
//         int n1=0,n2=0;
//         int counter=0;
//         int med,med1,med2;
//         double fin=0;
//         if(max_size%2!=0)
//         {
//             med = max_size/2;
            
            
//             while(true)
//             {
//                 if(n1==nums1.length)
//                 {
//                     if(counter==med)
//                         {
//                             fin = nums2[n2];
//                                 break;
//                         }
//                     n2++;
//                     counter++;
//                 }
                
//                 if(n2==nums2.length)
//                 {
//                     if(counter==med)
//                         {
//                             fin = nums1[n1];
//                                 break;
//                         }
//                     n1++;
//                     counter++;
//                 }
                
                
                
//                 if(nums1[n1]<nums2[n2])
//                 {
//                     if(counter==med)
//                         {
//                             fin = nums1[n1];
//                                 break;
//                         }
//                     n1++;
//                     counter++;
//                 }
//                 else
//                 {
//                      if(counter==med)
//                         {
//                             fin = nums2[n2];
//                                 break;
//                         }
//                     n2++;
//                     counter++;
//                 }
//             }
//         }
//         else
//         {
            
            
            
//             med1=(max_size/2) - 1;
//             med2=med1+1;
//             n1=0;
//             n2=0;
            
            
            
            
//             while(true)
//             {
//                 if(n1==nums1.length)
//                 {
//                     if(counter==med1)
//                     {
//                         med1 = nums2[n2];
//                         counter++;

//                     }
//                     else if(counter==med2)
//                     {
//                         med2 = nums2[n2];
//                             break;
//                     }
//                     n2++;
//                     counter++;
//                     System.out.println(n2+","+counter+"N2_HERE");
//                 }
                
                
//                 if(n2==nums2.length)
//                 {
//                     if(counter==med1)
//                     {
//                         med1 = nums1[n1];
//                         counter++;

//                     }
//                     else if(counter==med2)
//                     {
//                         med2 = nums1[n1];
//                             break;

//                     }
//                     n1++;
//                     counter++;
//                 }
                
                
//                 if(nums1[n1]<nums2[n2])
//                 {
//                     if(counter==med1)
//                     {
//                         med1 = nums1[n1];
//                         counter++;

//                     }
//                     else if(counter==med2)
//                     {
//                         med2 = nums1[n1];
//                             break;

//                     }
//                     n1++;
//                     counter++;
//                     System.out.println(n1+","+counter+"N1");
//                 }
                
                
                
                
//                 else
//                 {
//                      if(counter==med1)
//                     {
//                         med1 = nums2[n2];
//                          counter++;

//                     }
//                     else if(counter==med2)
//                     {
//                         med2 = nums2[n2];
//                             break;
//                     }
//                     n2++;
//                     counter++;
//                     System.out.println(n2+","+counter+"N2");
//                 }                
//             }
//             System.out.println(med1 + "," + med2);
//             fin = (med1+med2)/2;
//         }
        
        
        
        
        
        
        
//         return fin;
//          int[] arr = new int[nums1.length + nums2.length];
//         for(int i = 0; i<nums1.length; i++){
//             arr[i] = nums1[i];
//         }
//         for(int i = 0; i<nums2.length; i++){
//             arr[nums1.length + i] = nums2[i];
//         }
//         double result = 0;
//         for(int i = 0; i<arr.length; i++){
//             result += arr[i];
//         }
        
//         Arrays.sort(arr);
        
//        if(arr.length % 2 != 0){
//            return arr[arr.length/2];
//        }
//         double res = arr[arr.length/2 -1] + arr[arr.length/2];
        
//         return res/2 ;
        
        
                if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
            int x = nums1.length;
        int y = nums2.length;
        double median=0;

        int low = 0;
        int high = x;
        while (low <= high) {
            int partitionX = (low + high)/2;
            int partitionY = (x + y + 1)/2 - partitionX;

        
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                
                
                if ((x + y) % 2 == 0) {
                    median = ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                    break;
                } else {
                    median = (double)Math.max(maxLeftX, maxLeftY);
                    break;
                }
            } else if (maxLeftX > minRightY) { 
                high = partitionX - 1;
            } else { 
                low = partitionX + 1;
            }
        }
        return median;

    }
}