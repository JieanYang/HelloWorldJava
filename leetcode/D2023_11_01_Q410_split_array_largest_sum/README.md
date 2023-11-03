## Question

https://leetcode.com/problems/split-array-largest-sum/description/

## 思路

本题目的思路是从能够分的 subArray 的总和入手，我们去猜可以以 10-32 之间的 mid 去分，在对比分出来的数量 count 是否符合使用者的分法 m。

这是一个将分析某个目标值，转化成判定另一个目标值的巧妙思想。
