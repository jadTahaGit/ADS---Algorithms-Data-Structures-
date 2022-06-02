let sum = 0;

// We have a problem when we are calculating till 1 million
const sumOfNumbers = (upTO) => {
  for (let i = 1; i <= upTO; i++) {
    sum += i;
  }
  console.log(sum);
};

// Always Linear (more effective)
const sumOfNumbers2 = (upTO) => {
  n = upTO;
  sum = ((n + 1) * n) / 2;
  console.log(sum);
};

sumOfNumbers(1000000);
sumOfNumbers2(1000000);
