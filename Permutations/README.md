### Permutations [https://www.codewars.com/kata/5254ca2719453dcc0b00027d/train/java]

In this kata you have to create all permutations of an input string and remove duplicates, if present. This means, you have to shuffle all letters from the input in all possible orders.

Examples:

Permutations.singlePermutations("a") `shouldBe` ["a"]

Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]

Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]
