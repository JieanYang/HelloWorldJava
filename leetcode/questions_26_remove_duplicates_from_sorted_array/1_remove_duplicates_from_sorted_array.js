/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  let i = 0,
    j = 0;

  while (j < nums.length) {
    console.log("i", nums[i], "j", nums[j]);

    if (i === 0 || nums[i - 1] < nums[j]) {
      console.log("exchange");
      nums[i] = nums[j];
      i++;
    }

    j++;
  }

  return i;
};
