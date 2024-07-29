function Hello(){

    let name = 'Rama';
    let a=parseInt(30);
    let b=parseInt(29);
    let add=(a,b)=>{
        return a+b;
    }
    return <h3>
        hello im Aniket Khatal, and my best friends name is {name}<br></br>
        The addition of the two number is:{add()};
    </h3>
}
export default Hello;