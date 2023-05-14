import { useState } from 'react';

function Mouselocation() {
    const [position, setPosition] = useState();

    const handleClick = async(event) => {
        event.preventDefault();
        try {
          const response = await fetch('http://localhost:8081/api/mousePosition',{
            method:'POST',
            headers:{
              'Content-Type': 'application/json',
            },
            body: JSON.stringify({
              x1: x1,
              y1: y1,
            }),
          });
          const result = await response.text();
          console.log(result)

        } catch (error) {
          console.error(error);
        }
    };
    const location = () =>{
      
    }
  return (
    <div>
      <button onClick={handleClick}>Get mouse position</button>
      <p>X: {position.x}</p>
      <p>Y: {position.y}</p>
    </div>
  );
}

export default Mouselocation;