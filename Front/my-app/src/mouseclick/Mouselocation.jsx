import React, { useState } from 'react';
import axios from 'axios';

function Mouselocation() {
    axios.defaults.withCredentials = true;
  const [position, setPosition] = useState({ x: 0, y: 0 });

  const handleClick = async () => {
    try {
      const response = await axios.post('/api/mousePosition');
      setPosition(response.data);
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div>
      <button onClick={handleClick}>Get mouse position</button>
      <p>X: {position.x}</p>
      <p>Y: {position.y}</p>
    </div>
  );
}

export default Mouselocation;