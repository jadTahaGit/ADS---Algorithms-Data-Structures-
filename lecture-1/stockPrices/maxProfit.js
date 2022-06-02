// stock_prices = [10, 7, 5, 8, 11, 9];
stock_prices = [10, 7, 8, 11, 5, 9];
// stock_prices = [10, 7, 8, 11, 5, 8];
// stock_prices = [12, 11, 5, 9];

const getMinPrice = (array) => {
  let min = array[0];
  let minIndex = 0;
  for (let i = 0; i < array.length; i++) {
    if (min > array[i]) {
      min = array[i];
      minIndex = i;
      //   console.log(minIndex, maxIndex);
    }
  }
  minArray = [min, minIndex];
  //   console.log(minArray);
  return minArray;
};

const getMaxPrice = (array) => {
  minArray = getMinPrice(array);
  minIndex = minArray[1];
  //   console.log(minIndex);

  let max = array[0];
  let maxIndex = 0;
  for (let i = minIndex; i < array.length; i++) {
    if (max < array[i]) {
      max = array[i];
      maxIndex = i;
    }
  }

  maxArray = [max, maxIndex];
  //   console.log(maxArray);
  return maxArray;
};

const getMaxProfit = (array) => {
  // get MaxPrice
  const maxPrice = getMaxPrice(array);
  //get MinPrice
  const minPrice = getMinPrice(array);
  result = maxPrice[0] - minPrice[0];
  if (result <= 0) {
    console.log(`it sucks. Profit ${result}$`);
  } else {
    console.log(
      `buy on ${minPrice[0]}$ and sell it on ${maxPrice[0]}$ to win ${result}$`
    );
  }
  return result;
};

getMaxProfit(stock_prices);
