// stock_prices = [10, 7, 5, 8, 11, 9];
// stock_prices = [10, 7, 8, 11, 5, 9];
// stock_prices = [10, 7, 8, 11, 5, 8];
stock_prices = [12, 11, 5, 9];

const getMaxProfit = (array) => {
  let maxProfit = array[1] - array[0];
  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length; j++) {
      let testProfit = array[j] - array[i];
      if (testProfit > maxProfit) {
        maxProfit = testProfit;
      }
    }
  }
  console.log(maxProfit);
  return maxProfit;
};

getMaxProfit(stock_prices);
