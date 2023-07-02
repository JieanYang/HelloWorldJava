/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function (height) {
  const maxLeftArray = [];
  const maxRightArray = [];

  let maxLeft = height[0];
  for (let n = 0; n < height.length; n++) {
    maxLeftArray[n] = maxLeft;
    if (height[n] > maxLeft) {
      maxLeft = height[n];
    }
  }

  let maxRight = height[height.length - 1];
  for (let n = height.length - 1; n >= 0; n--) {
    maxRightArray[n] = maxRight;
    if (height[n] > maxRight) {
      maxRight = height[n];
    }
  }

  console.log("maxLeftArray", maxLeftArray);
  console.log("maxRightArray", maxRightArray);

  let sum = 0;
  for (let n = 0; n < height.length; n++) {
    const value = Math.min(maxLeftArray[n], maxRightArray[n]) - height[n];
    sum += value > 0 ? value : 0;
  }

  return sum;
};
