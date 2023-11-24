## Question

https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

## Thoughts

双指针的题目中，i 指的是待定处理的位置，我们会判断 j 所指的值是否满足某个特定条件，这个条件和 i 位置的值可能相关，**也可能不相关**。

如果要做交换，肯定是 j 的值 与 i 的值发生交换。

因为 j 的值满足了某个条件，所以移动 j 的值到 i 的位置，替代 i 的值。
