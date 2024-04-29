const array_1: number[] = [1, 2, 3];
const array_2: number[] = [4, 5, 6];

export const mergeTwoArraySorted = (array1: number[], array2: number[]) => {
  let pointer1 = 0,
    pointer2 = 0;

  const result: number[] = [];
  while (pointer1 < array1.length || pointer2 < array2.length) {
    if (pointer1 === array1.length) {
      result.push(array2[pointer2]);
      pointer2++;
      continue;
    }
    if (pointer2 === array2.length) {
      result.push(array1[pointer1]);
      pointer1++;
      continue;
    }
    if (array1[pointer1] <= array2[pointer2]) {
      result.push(array1[pointer1]);
      pointer1++;
    } else {
      result.push(array2[pointer2]);
      pointer2++;
    }
  }
  return result;
};

const test_1 = () => {
  const result_1 = mergeTwoArraySorted(array_1, array_2);
  console.log("sortTwoArray(array_1, array_2) result: ", result_1);
  console.log("javascript method", [...array_1, ...array_2].sort());
};

// test_1();
