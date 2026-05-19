const prompt = require("prompt-sync")();
let age = Number(prompt("Please enter your age?  "));
sum = 5;
sum += age;
console.log(sum);
console.log("You will be "+ sum + "  years in five years time....");
