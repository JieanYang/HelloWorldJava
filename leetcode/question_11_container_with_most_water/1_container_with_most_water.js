/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
  let i = 0,
    j = height.length - 1,
    max = 0;

  while (i < j) {
    const width = j - i;
    const ht = Math.min(height[i], height[j]);
    const area = width * ht;

    max = Math.max(max, area);

    if (height[i] < height[j]) {
      i++;
      continue;
    }
    if (height[i] > height[j]) {
      j--;
      continue;
    }
    if (height[i] == height[j]) {
      i++;
      j--;
      continue;
    }
  }

  return max;
};
