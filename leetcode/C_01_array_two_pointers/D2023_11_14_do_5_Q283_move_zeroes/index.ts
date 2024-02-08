/**
 Do not return anything, modify nums in-place instead.
 */
// @ts-ignore
function moveZeroes(nums: number[]): void {
  let i: number = 0;

  for (const num of nums) {
    if (num !== 0) {
      nums[i] = num;
      i++;
    }
  }

  while (i < nums.length) {
    nums[i] = 0;
    i++;
  }
}
