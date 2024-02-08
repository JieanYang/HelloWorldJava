/**
 Do not return anything, modify nums in-place instead.
 */
// @ts-ignore
function moveZeroes(nums: number[]): void {
  let i: number = 0;
  let j: number = 0;

  while (j < nums.length) {
    if (nums[j] != 0) {
      const tmp = nums[j];
      nums[j] = nums[i];
      nums[i] = tmp;
      i++;
    }
    j++;
  }
}
