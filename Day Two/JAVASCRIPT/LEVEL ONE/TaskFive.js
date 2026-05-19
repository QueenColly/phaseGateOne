const prompt = require("prompt-sync")();
let temperature = Number(prompt("Please enter a temperature in Celsuis?  "));

multiply = temperature * 1.8;
sum = multiply + 32;

console.log("Your answer is  "+ sum+ " Fahrenheit");

