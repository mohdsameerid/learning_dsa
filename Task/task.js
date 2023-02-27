
// Answer (1):

let count = 0;  // initialize count to 0
// loop through all two-digit numbers from 10 to 99
for (let i = 10; i <= 99; i++) {
  let digits = i.toString().split('').map(Number);  // convert number to array of digits
  let isValid = true;
  // check that each digit is smaller than the one to its right
  for (let j = 0; j < digits.length - 1; j++) {
    if (digits[j] >= digits[j+1]) {
      isValid = false;
      break;
    }
  }
  if (isValid) {
    count++;  // increment count if number is valid
  }
}
console.log(count);  // output the total number of valid numbers



///////////////////////////////////////////////////////////////////////////////////////////////
// Answers (2):

function generateSteps(num1, num2) {
  let carryString = '';
  let sumString = '';
  
  // Convert the numbers to arrays of digits and reverse them
  const arr1 = Array.from(String(num1), Number).reverse();
  const arr2 = Array.from(String(num2), Number).reverse();

  // Loop through the arrays and add each pair of digits
  for (let i = 0; i < Math.max(arr1.length, arr2.length); i++) {
    const digit1 = arr1[i] || 0; 
    const digit2 = arr2[i] || 0; 
    const sum = digit1 + digit2 + (carryString ? 1 : 0); 
    const carry = Math.floor(sum / 10); 
    const newDigit = sum % 10;  
    carryString += carry; 
    sumString = newDigit.toString() + sumString; 
  }
  
  // Generate the steps as a JSON object
  const steps = {};
  var arr= [];  // shifted position
  for (let i = 1,j=0; i <= carryString.length; i++,j++) {
    // const carry = carryString.slice(0, i);
    var sum = sumString.slice(i - 1);
    
        arr[1+2-j]= sum;
  
  }
  for (let i = 1,j=0; i <= carryString.length; i++,j++) {
    const carry = carryString.slice(0, i);
    steps[`step${i}`] = { carryString: carry, sumString: arr[i-1] };
  }
  return steps;
}

// Example usage:
const num1 = 1489;
const num2 = 714;
const steps = generateSteps(num1, num2);

console.log(steps);