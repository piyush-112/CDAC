function Random() {
    let num = Math.random() * 100;

    return <h1 style={{ 'background-color': '#776691' }}>
        Random Number is: {Math.round(num)}
    </h1>
}
export default Random;