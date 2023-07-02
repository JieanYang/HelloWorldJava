/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function (height) {
  let maxLeft = 0,
    maxRight = 0;

  let left = 0,
    right = height.length - 1;

  let sum = 0;

  while (left <= right) {
    if (maxLeft < maxRight) {
      if (height[left] >= maxLeft) {
        maxLeft = height[left];
      } else {
        const value = maxLeft - height[left];
        sum += value;
      }
      left++;
    } else {
      if (height[right] >= maxRight) {
        maxRight = height[right];
      } else {
        const value = maxRight - height[right];
        sum += value;
      }

      right--;
    }
  }

  return sum;
};
