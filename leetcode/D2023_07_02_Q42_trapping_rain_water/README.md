## Questoin

https://leetcode.com/problems/trapping-rain-water/description/

### Solution 1

记录一个位置左边和右边最高的柱子高度，然后计算该位置能填多少水: Max.min(maxLeft, maxRight) - height

我们需要记录 3 组数组，一组记录每个位置的 maxLeft，一组记录每个位置的 maxRight，最后一组记录每个位置的填充水量。

方案中需要做 3 次 loop。

### Solution 2

方案 2 的所计算的方式其实和方案 1 差不多，唯一不同的是，方案 1 是将所有内容记录下来，无论是否有用。

方案 2 则是动态的维护 maxLeft 和 maxRight 两个变量，有两个大的判断

- 判断是 maxLeft 和 maxRigth 哪边高
- 然后 math.min(maxLeft, maxRight) 高度更低的地方，即左边低，算 left 和 maxLeft 的关系, 右边低，算 right 和 maxRight 的关系
- 通过关系并计算当前位置，即 left 或 right 的水量
