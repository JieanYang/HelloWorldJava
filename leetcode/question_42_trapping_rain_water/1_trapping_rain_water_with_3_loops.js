/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function (height) {
  const maxLeftArray = [];
  const maxRightArray = [];
  const watterArray = [];

  let maxLeft;
  for (let n = 0; n < height.length; n++) {
    if (n === 0) {
      maxLeftArray[n] = 0;
      maxLeft = height[n];
    } else {
      maxLeftArray[n] = maxLeft;
      if (height[n] > maxLeft) {
        maxLeft = height[n];
      }
    }
  }

  let maxRight;
  for (let n = height.length - 1; n >= 0; n--) {
    if (n === height.length - 1) {
      maxRightArray[height.length - 1] = 0;
      maxRight = height[n];
    } else {
      maxRightArray[n] = maxRight;
      if (maxRightArray[n] > maxRight) {
        maxRight = maxRightArray[n];
      }
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
