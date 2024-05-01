const isSplitNumberByEstimationSum = (
  nums: number[],
  estimationSum: number,
  k: number
): boolean => {
  let sum = 0,
    count: number = 0;

  for (const num of nums) {
    if (num + sum > estimationSum) {
      count++;
      sum = num;
    } else {
      sum += num;
    }
  }

  count++;

  return count > k;
};

const isSplitNumberByEstimationSum_2 = (
  nums: number[],
  estimationSum: number,
  k: number
): boolean => {
  let sum = 0,
    count: number = 1;

  for (const num of nums) {
    sum += num;
    if (sum > estimationSum) {
      count++;
      sum = num;
    }
  }

  return count > k;
};

// @ts-ignore
function splitArray(nums: number[], k: number): number {
  let min: number = nums[0],
    max: number = 0;

  for (const num of nums) {
    min = Math.max(min, num);
    max += num;
  }

  let left: number = min,
    right: number = max;
  while (left < right) {
    console.log("before left", left);
    console.log("before right", right);
    const mid = left + Math.floor((right - left) / 2);
    console.log("mid", mid);

    console.log(
      "isSplitNumberByEstimationSum(nums, mid, k)",
      isSplitNumberByEstimationSum(nums, mid, k)
    );
    if (isSplitNumberByEstimationSum(nums, mid, k)) {
      left = mid + 1;
    } else {
      right = mid;
    }
    console.log("after left", left);
    console.log("after right", right);
  }

  return left;
}
