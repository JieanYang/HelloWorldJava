import { mergeTwoArraySorted } from "./solution_1";

const array_multiple: number[][] = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

const mergeMultipleArraysSorted = (arrays: number[][]): number[] => {
  if (arrays.length === 0) {
    return [];
  } else if (arrays.length === 1) {
    return arrays[0];
  } else if (arrays.length === 2) {
    return mergeTwoArraySorted(arrays[0], arrays[1]);
  }

  const mid = Math.floor(arrays.length / 2);
  const leftHalf = mergeMultipleArraysSorted(arrays.slice(0, mid));
  const rightArray = mergeMultipleArraysSorted(arrays.slice(mid));

  return mergeTwoArraySorted(leftHalf, rightArray);
};

const test_2 = () => {
  const result_2 = mergeMultipleArraysSorted(array_multiple);
  console.log("mergeMultipleArraysSorted(array_multiple)", result_2);
};

test_2();
