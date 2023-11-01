// problem

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var splitArray = function (nums, k) {
  let lowRange = 0;
  let maxRange = 0;

  for (const num of nums) {
    lowRange = Math.max(lowRange, num);
    maxRange += num;
  }

  console.log("lowRange", lowRange);
  console.log("maxRange", maxRange);

  let left = lowRange;
  let right = maxRange;
  console.log("left", left);
  console.log("right", right);
  let mid;
  while (left < right) {
    mid = (left + (right - left)) / 2;

    console.log("mid", mid);

    // split count for nums under mid sum
    let count = 0;
    let sum = 0;
    for (let i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum >= mid) {
        sum = 0;
        count++;
      }
    }

    count++;

    console.log("count", count);

    if (count <= k) {
      right = mid - 1;
    } else {
      left = mid + 1;
    }
  }

  return mid;
};

const resutls = splitArray([7, 2, 5, 10, 8], 2);
console.log("results", resutls);
