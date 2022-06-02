//Based on the fast inverse square root function
// https://en.wikipedia.org/wiki/Fast_inverse_square_root

const inverseSquareRoot = (number) => {
  let i;
  let x2, y;
  const threehalfs = 1.5;

  x2 = number * 0.5;
  y = number;
  //evil floating bit level hacking
  var buffer = new ArrayBuffer(4);

  new Float32Array(buffer)[0] = number;
  console.log(buffer);
  i = new Uint32Array(buffer)[0];
  i = 0x5f3759df - (i >> 1); //What the fuck?
  console.log(i);
  new Uint32Array(buffer)[0] = i;
  y = new Float32Array(buffer)[0];
  y = y * (threehalfs - x2 * y * y); // 1st iteration | Newton Iteration
  // //  y  = y * ( threehalfs - ( x2 * y * y ) );   // 2nd iteration, this can be removed
  console.log(y);

  // return y;
};

inverseSquareRoot(4);
