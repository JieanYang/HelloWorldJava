## Questoin

https://leetcode.com/problems/trapping-rain-water/description/

### Solution 1

记录一个位置左边和右边最高的柱子高度，然后计算该位置能填多少水: Max.min(maxLeft, maxRight) - height

我们需要记录 3 组数组，一组记录每个位置的 maxLeft，一组记录每个位置的 maxRight，最后一组记录每个位置的填充水量。

方案中需要做 3 次 loop。

### Solution 2
