# Java & DSA Revision

My Java fundamentals and Data Structures & Algorithms practice, written in Java, as part of my software engineering and AI/ML placement preparation.

**LeetCode problems solved here:** 35 · **Main topic so far:** Arrays

---

## Repository structure

```text
JAVA-AND-DSA-REVISION-/
├── 01-java-basics/          Variables, operators, conditionals, loops, patterns, functions
├── 02-arrays/               Array basics, second largest, pairs, subarrays, prefix sum, max subarray
├── 03-searching-sorting/    Binary search, bubble, selection and insertion sort
├── 04-2d-arrays/            Matrix input/output, spiral traversal, diagonal sum
├── 05-revision/             Revision files where I re-solve older concepts
└── leetcode/
    ├── arrays/
    ├── strings/
    └── matrix/
```

LeetCode files are named `LC<number>_<ProblemName>.java`, with the number padded to 4 digits, so they sort in order.

---

## 01 · Java Basics

| File | Topic |
|---|---|
| [VariablesAndDatatypes.java](01-java-basics/VariablesAndDatatypes.java) | Variables, data types, input/output |
| [Operators.java](01-java-basics/Operators.java) | Arithmetic, relational, logical operators |
| [ConditionalStatements.java](01-java-basics/ConditionalStatements.java) | if / else-if / switch |
| [Loops.java](01-java-basics/Loops.java) | for, while, do-while |
| [AlphabetPattern.java](01-java-basics/AlphabetPattern.java) | Alphabet pattern printing |
| [Functions_GcdLcm.java](01-java-basics/Functions_GcdLcm.java) | Functions: GCD, and LCM using GCD as a helper |
| [Functions_CountDigitsEvenOdd.java](01-java-basics/Functions_CountDigitsEvenOdd.java) | Functions: count digits, even/odd, GCD |
| [BinomialCoefficient.java](01-java-basics/BinomialCoefficient.java) | Binomial coefficient using factorial |

## 02 · Arrays

| File | Topic |
|---|---|
| [ArrayBasics_LinearBinarySearch.java](02-arrays/ArrayBasics_LinearBinarySearch.java) | Arrays as function arguments, linear search, largest element, binary search |
| [SecondLargestAndIsSorted.java](02-arrays/SecondLargestAndIsSorted.java) | Second largest element; check if array is sorted |
| [SecondLargest.java](02-arrays/SecondLargest.java) | Second largest element |
| [PairsInArray.java](02-arrays/PairsInArray.java) | Printing all pairs |
| [BinarySearchReversePairsSubarrays.java](02-arrays/BinarySearchReversePairsSubarrays.java) | Binary search, two-pointer reverse, pairs, subarrays |
| [PrefixSum.java](02-arrays/PrefixSum.java) | Prefix sum array |
| [KadanesAlgorithm.java](02-arrays/KadanesAlgorithm.java) | Kadane's algorithm for max subarray sum |
| [MaxSubarraySum_BruteForceAndPrefix.java](02-arrays/MaxSubarraySum_BruteForceAndPrefix.java) | Max subarray sum: brute force, then prefix sum |

## 03 · Searching & Sorting

| File | Topic |
|---|---|
| [BinarySearch.java](03-searching-sorting/BinarySearch.java) | Binary search |
| [BubbleSort.java](03-searching-sorting/BubbleSort.java) | Bubble sort |
| [SelectionSort.java](03-searching-sorting/SelectionSort.java) | Selection sort |
| [BubbleAndSelectionSort.java](03-searching-sorting/BubbleAndSelectionSort.java) | Bubble and selection sort together |
| [BubbleAndSelectionSort_Practice.java](03-searching-sorting/BubbleAndSelectionSort_Practice.java) | Bubble and selection sort, practice rewrite |
| [InsertionSort.java](03-searching-sorting/InsertionSort.java) | Insertion sort |

## 04 · 2D Arrays

| File | Topic |
|---|---|
| [TwoDimensionalArrays.java](04-2d-arrays/TwoDimensionalArrays.java) | Reading and printing a matrix |
| [SpiralMatrix.java](04-2d-arrays/SpiralMatrix.java) | Spiral order traversal |
| [DiagonalSum.java](04-2d-arrays/DiagonalSum.java) | Primary + secondary diagonal sum |
| [RowSums.java](04-2d-arrays/RowSums.java) | Sum of each row into a list |

## 05 · Revision

| File | Topic |
|---|---|
| [Revision01_SearchAndReverse.java](05-revision/Revision01_SearchAndReverse.java) | Linear/binary search, two-pointer reverse |
| [Revision02_ReverseAndPairs.java](05-revision/Revision02_ReverseAndPairs.java) | Reverse array, pairs |
| [Revision03_MaxSubarrayBruteForce.java](05-revision/Revision03_MaxSubarrayBruteForce.java) | Max subarray (brute force) |
| [Revision04_KadaneAndPrefixSum.java](05-revision/Revision04_KadaneAndPrefixSum.java) | Max subarray: prefix sum and Kadane's algorithm |
| [Revision05_SubarraysAndMaxSum.java](05-revision/Revision05_SubarraysAndMaxSum.java) | Printing subarrays; max subarray sum O(n³) → O(n²) → Kadane |

---

## LeetCode

### Arrays

| # | Problem | File |
|---|---|---|
| 1 | Two Sum | [LC0001_TwoSum.java](leetcode/arrays/LC0001_TwoSum.java) |
| 26 | Remove Duplicates from Sorted Array | [LC0026](leetcode/arrays/LC0026_RemoveDuplicatesFromSortedArray.java) |
| 27 | Remove Element | [LC0027](leetcode/arrays/LC0027_RemoveElement.java) |
| 35 | Search Insert Position | [LC0035](leetcode/arrays/LC0035_SearchInsertPosition.java) |
| 42 | Trapping Rain Water | [LC0042](leetcode/arrays/LC0042_TrappingRainWater.java) |
| 53 | Maximum Subarray (Kadane's) | [LC0053](leetcode/arrays/LC0053_MaximumSubarray.java) |
| 75 | Sort Colors | [LC0075](leetcode/arrays/LC0075_SortColors.java) |
| 88 | Merge Sorted Array | [LC0088](leetcode/arrays/LC0088_MergeSortedArray.java) |
| 121 | Best Time to Buy and Sell Stock | [LC0121](leetcode/arrays/LC0121_BestTimeToBuyAndSellStock.java) |
| 153 | Find Minimum in Rotated Sorted Array | [LC0153](leetcode/arrays/LC0153_FindMinimumInRotatedSortedArray.java) |
| 169 | Majority Element | [LC0169](leetcode/arrays/LC0169_MajorityElement.java) |
| 217 | Contains Duplicate | [LC0217](leetcode/arrays/LC0217_ContainsDuplicate.java) |
| 283 | Move Zeroes | [LC0283](leetcode/arrays/LC0283_MoveZeroes.java) |
| 485 | Max Consecutive Ones | [LC0485](leetcode/arrays/LC0485_MaxConsecutiveOnes.java) |
| 561 | Array Partition | [LC0561](leetcode/arrays/LC0561_ArrayPartition.java) |
| 628 | Maximum Product of Three Numbers | [LC0628](leetcode/arrays/LC0628_MaximumProductOfThreeNumbers.java) |
| 905 | Sort Array By Parity | [LC0905](leetcode/arrays/LC0905_SortArrayByParity.java) |
| 1295 | Find Numbers with Even Number of Digits | [LC1295](leetcode/arrays/LC1295_FindNumbersWithEvenNumberOfDigits.java) |
  | 1470 | Shuffle the Array | [LC1470](leetcode/arrays/LC1470_ShuffleTheArray.java) |
| 1480 | Running Sum of 1d Array | [LC1480](leetcode/arrays/LC1480_RunningSumOf1dArray.java) |
| 1512 | Number of Good Pairs | [LC1512](leetcode/arrays/LC1512_NumberOfGoodPairs.java) |
| 1913 | Maximum Product Difference Between Two Pairs | [LC1913](leetcode/arrays/LC1913_MaximumProductDifferenceBetweenTwoPairs.java) |
| 1920 | Build Array from Permutation | [LC1920](leetcode/arrays/LC1920_BuildArrayFromPermutation.java) |
| 1991 | Find the Middle Index in Array (pivot index) | [LC1991](leetcode/arrays/LC1991_FindTheMiddleIndexInArray.java) |
| 2574 | Left and Right Sum Differences | [LC2574](leetcode/arrays/LC2574_LeftAndRightSumDifferences.java) |

### Strings

| # | Problem | File |
|---|---|---|
| 344 | Reverse String | [LC0344](leetcode/strings/LC0344_ReverseString.java) |
| 709 | To Lower Case | [LC0709](leetcode/strings/LC0709_ToLowerCase.java) |

### Matrix

| # | Problem | File |
|---|---|---|
| 59 | Spiral Matrix II | [LC0059](leetcode/matrix/LC0059_SpiralMatrixII.java) |
| 766 | Toeplitz Matrix | [LC0766](leetcode/matrix/LC0766_ToeplitzMatrix.java) |
| 832 | Flipping an Image | [LC0832](leetcode/matrix/LC0832_FlippingAnImage.java) |
| 867 | Transpose Matrix | [LC0867](leetcode/matrix/LC0867_TransposeMatrix.java) |
| 1351 | Count Negative Numbers in a Sorted Matrix | [LC1351](leetcode/matrix/LC1351_CountNegativeNumbersInSortedMatrix.java) |
| 1672 | Richest Customer Wealth | [LC1672](leetcode/matrix/LC1672_RichestCustomerWealth.java) |
| 2022 | Convert 1D Array Into 2D Array | [LC2022](leetcode/matrix/LC2022_Convert1DArrayInto2DArray.java) |
| 2319 | Check if Matrix Is X-Matrix | [LC2319](leetcode/matrix/LC2319_CheckIfMatrixIsXMatrix.java) |
| 2643 | Row With Maximum Ones | [LC2643](leetcode/matrix/LC2643_RowWithMaximumOnes.java) |

---

## Roadmap

- [x] Java basics
- [x] Arrays, prefix sum, Kadane's algorithm
- [x] Basic sorting and binary search
- [x] 2D arrays
- [ ] Strings (in depth)
- [ ] Recursion & backtracking
- [ ] OOP: classes, constructors, inheritance, polymorphism, abstraction, encapsulation
- [ ] Linked lists, stacks, queues
- [ ] Trees and graphs

## How to run a file

```bash
java 02-arrays/PrefixSum.java
```

Java 11+ can run a single `.java` file directly without `javac`.

---

**Author:** Anirudh Kakarla
