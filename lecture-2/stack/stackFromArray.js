// Stacks
// Palindrom
// functions: push, pop, peek, length

const letters = []; //This our stack

const word = "racecar";

let rword = "";

// put letters of word into stack
for (let i = 0; i < word.length; i++) {
  letters.push(word[i]);
}

// pop off the stack in reverse order:
for (let i = 0; i < word.length; i++) {
  rword += letters.pop();
}

if (rword === word) {
  console.log(word + " is a palindrom.");
} else {
  console.log(word + " is not a palindrom");
}
