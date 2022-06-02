const oneTo25 = [];
for (let i = 2; i <= 25; i++) {
  if (i != 2 && i % 2 == 0) {
    continue;
  }
  if (i != 3 && i % 3 == 0) {
    continue;
  }
  if (i != 5 && i % 5 == 0) {
    continue;
  }
  oneTo25.push(i);
}

console.log(oneTo25);
