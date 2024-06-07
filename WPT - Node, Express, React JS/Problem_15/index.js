function acceptData(){
    const wordArray=[];
    const reverseWordArray = [];
    for (let i = 0; i < 5; i++) {
        wordArray.push(prompt("Enter Word : "));       
    }
    console.log(wordArray);

    wordArray.forEach(word => {
        let splitString = word.split("");
        splitString.reverse();
        reverseWordArray.push(splitString.join(""));
    });
    const sortedReverseWordArray = reverseWordArray.sort();
    sortedReverseWordArray.forEach(element => {
        console.log(element);
    })
}
acceptData();
