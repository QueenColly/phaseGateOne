const prompt = require("prompt-sync")();


 
guessNumber =15;
for (let number = 1; number <= 5; number++){

let guessNumber = prompt("Enter a number: ");

    if (number > 5){
        break;
}

    if (guessNumber == 15 ){
        console.log("Correct");
}
        else if(guessNumber> 15 ){
        console.log("High");
}

        else if(guessNumber < 15){
        console.log("Low");
}

}
