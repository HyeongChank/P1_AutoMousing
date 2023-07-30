
import './App.css';
// import Mouselocation from './mouseclick/Mouselocation';
import MouseCoordinates from './mouseclick/MouseCoordinates';
import { BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <MouseCoordinates/>
      </BrowserRouter>
    </div>
  );
}

export default App;
