function removeDuplicates(nums: number[]): number {
  let i: number = 2,
    j: number = 2;

  while (j < nums.length) {
    if (nums[i - 2] !== nums[j]) {
      const tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
      i++;
    }
    j++;
  }

  return i;
}
