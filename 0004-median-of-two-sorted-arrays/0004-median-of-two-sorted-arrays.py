class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        median = 0
        nums = nums1+nums2
        nums.sort()
        n=len(nums)
        if(n%2==0):
            x= int(n/2)
            median = float( (nums[x]+nums[x-1] )/2.0)
        else:
            x=int(n/2)
            median=float(nums[x])
        return median
