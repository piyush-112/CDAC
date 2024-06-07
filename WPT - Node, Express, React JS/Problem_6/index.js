const calculateSumOfDigit = (e) =>{
    e.preventDefault()
    let num = parseInt(document.getElementById("num").value)
    if (isNaN(num)) {
        document.getElementsByClassName("result")[0].innerHTML="Enter Number in Number field"
        return
    }
    let sum=0;
    while (num>0) {
        sum+=num%10
        num/=10
        num = parseInt(num)
    }
    document.getElementsByClassName("result")[0].innerHTML=`Sum of Digits: ${parseInt(sum)}`

}