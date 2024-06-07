const min = (...Numbers)=>{
    let min = Numbers[0];
    for (let i = 0; i < Numbers.length; i++) {
            if (Numbers[i] < min) {
                min = Numbers[i]
            }
        }
        return min
}

const getMin = (e) =>{
    e.preventDefault()
    let num = document.getElementById("num").value
    const myArray = num.split(" ")
    const myIntArray = []
    
    myArray.forEach(element => {
        myIntArray.push(parseInt(element))
    });

    const  minNumber = min(...myIntArray)

    document.getElementsByClassName("result")[0].innerHTML=`Minimun Number: ${minNumber}`
}
























// var fun1 = new Function(myIntArray, `{
//     console.log("numbers : " + numbers)
//     let min = numbers[0];
//     console.log(typeof(min))
//     for (let i = 0; i < numbers.length; i++) {
//         for (let j = i+1; j < numbers.length; j++) {
//             if (numbers[i] < numbers[j]) {
//                 min = numbers[i]
//             }
//         }
        
//     }
//     console.log("min : "+min);
// }`)