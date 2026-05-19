const prompt = require("prompt-sync")();
let price = Number(prompt("Please enter a price?  "));

item = price + 0.1;
console.log("The price is " + item)
