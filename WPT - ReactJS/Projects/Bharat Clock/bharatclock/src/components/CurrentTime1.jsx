
let CurrentTime1 = () => {
    let time=new Date();
    return <p className="fst-italic">This is the current Time:{time.toLocaleDateString()}-{time.toLocaleTimeString()}</p>;
};
export default CurrentTime1;