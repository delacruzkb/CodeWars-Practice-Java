# Permutations [https://www.codewars.com/kata/catching-car-mileage-numbers/train/java]

> "7777...8?!??!", exclaimed Bob, "I missed it again! Argh!" 
Every time there's an interesting number coming up, he notices and then promptly forgets. 
Who doesn't like catching those one-off interesting mileage numbers?
In this kata you have to create all permutations of an input string and remove duplicates, if present. 
This means, you have to shuffle all letters from the input in all possible orders.

Let's make it so Bob never misses another interesting number. 
We've hacked into his car's computer, and we have a box hooked up that reads mileage numbers. 
We've got a box glued to his dash that lights up yellow or green depending on whether it receives a 1 or a 2 (respectively).

It's up to you, intrepid warrior, to glue the parts together. Write the function that parses the mileage number input, and returns a 2 if the number is "interesting" (see below), a 1 if an interesting number occurs within the next two miles, or a 0 if the number is not interesting.

## "Interesting" Numbers
Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:
1. Any digit followed by all zeros: 100, 90000
2. Every digit is the same number: 1111
3. The digits are sequential, incementing†: 1234
4. The digits are sequential, decrementing‡: 4321
5. The digits are a palindrome: 1221 or 73837
6. The digits match one of the values in the awesomePhrases array

>† For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.

So, you should expect these inputs and outputs:

```
// "boring" numbers
CarMileage.isInteresting(3, new int[]{1337, 256});    // 0
CarMileage.isInteresting(3236, new int[]{1337, 256}); // 0

// progress as we near an "interesting" number
CarMileage.isInteresting(11207, new int[]{}); // 0
CarMileage.isInteresting(11208, new int[]{}); // 0
CarMileage.isInteresting(11209, new int[]{}); // 1
CarMileage.isInteresting(11210, new int[]{}); // 1
CarMileage.isInteresting(11211, new int[]{}); // 2

// nearing a provided "awesome phrase"
CarMileage.isInteresting(1335, new int[]{1337, 256}); // 1
CarMileage.isInteresting(1336, new int[]{1337, 256}); // 1
CarMileage.isInteresting(1337, new int[]{1337, 256}); // 2
```

## Error Checking
1. A number is only interesting if it is greater than 99!
2. Input will always be an integer greater than 0, and less than 1,000,000,000
3. The awesomePhrases array will always be provided, and will always be an array, but may be empty. (Not everyone thinks numbers spell funny words...)
4. You should only ever output 0, 1, or 2
