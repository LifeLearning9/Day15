# Day15 Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).Find two lines that together with the x-axis form a container, such that the container contains the most water. Return the maximum amount of water a container can store.

**TestCases**
 1. Input: height = [1,8,6,2,5,4,8,3,7]      Output: 49
2. Input: height = [1,1]                   Output: 1

**Intuition**
1. A brute force approach would check all possible pairs (i,j) → O(n²), which is too slow.
2.Smarter way: use two pointers at the ends of the array.
3.At every step:
  Calculate area between l and r.Move the pointer pointing to the smaller height, because only this can potentially increase the area (width decreases when we move inward, so we must hope for a taller line to compensate).
4. Repeat until l and r meet.

**Algorithm Flow**
1. Initialize:
    l = 0 (left pointer), r = n-1 (right pointer), res = 0.
2. While l < r:
  Compute height = min(height[l], height[r]).
  Compute width = r - l.
  Compute area = height * width.
  Update res = max(res, area).
  If height[l] < height[r], move l++ (because left line is limiting).
  Else, move r--.
3. Print res

   
**Complexity Analysis**
1. Time Complexity: O(n)
2. Space Complexity: O(1)
