## Question

https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

## Solution

本题目便利数组，利用 `condition arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]` 条件去做判断。
