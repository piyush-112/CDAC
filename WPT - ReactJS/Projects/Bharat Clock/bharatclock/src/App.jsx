import ClockHeading from './components/ClockHeading'
import ClockSlogan from './components/ClockSlogan'
import CurrentTime1 from './components/CurrentTime1'
import "bootstrap/dist/css/bootstrap.min.css";
import './App.css'


function App() {
  

  return (
    <center>
    <div>
      <ClockHeading></ClockHeading>
      <p>--------------------------------------------------</p>
      <ClockSlogan></ClockSlogan>
      <CurrentTime1></CurrentTime1>
    </div>
    </center>
  )
}

export default App
