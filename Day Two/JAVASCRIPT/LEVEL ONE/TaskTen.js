const prompt = require("prompt-sync")();
sum = 0;
for (let index = 1; index <= 3; index++){
let number = Number(prompt("Please enter a number?  "));
    sum = sum + number;
}

    average =  sum/3;


console.log("The average is " + average);
