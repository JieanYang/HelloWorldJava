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

  while (left < right) {
    const mid = left + Math.floor((right - left) / 2);

    console.log("mid", mid);

    // split count for nums under mid sum
    let count = 0;
    let sum = 0;
    for (let i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum > mid) {
        count++;
        sum = nums[i];
      }
    }

    count++;

    console.log("count", count);
    console.log("k", k);

    // if (count <= k) { // results 17
    //   console.log("here");
    //   right = mid - 1;
    // } else {
    //   left = mid;
    // }

    if (count > k) {
      left = mid + 1;
    } else {
      right = mid;
    }
  }

  console.log("left", left);
  console.log("right", right);

  return left;
};

const resutls = splitArray([7, 2, 5, 10, 8], 2);
console.log("results", resutls);
