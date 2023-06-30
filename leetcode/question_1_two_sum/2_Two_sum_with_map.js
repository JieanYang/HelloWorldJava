// 使用 Map 减少一个 n 的时间复杂度，转为存储 Map 换取一个 n 的空间复杂度

var twoSum = function (nums, target) {
  const map = new Map();

  for (let i = 0; i < nums.length; i++) {
    const item = nums[i];
    const x = target - item;
    console.log("x", x);
    if (map.has(x)) {
      return [map.get(x), i];
    }

    map.set(item, i);
  }

  return [0, 0];
};

var result_1 = twoSum([3, 2, 4], 6);
console.log("result", result_1);
