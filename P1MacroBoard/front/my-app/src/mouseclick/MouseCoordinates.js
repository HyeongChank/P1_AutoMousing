import React, { useState, useEffect } from 'react';
import './MainCs.css'

const MouseCoordinates = () => {
  const [isTracking, setIsTracking] = useState(false);
  const [coordinates, setCoordinates] = useState({ x: 0, y: 0 });
  const [clickCoordinates, setClickCoordinates] = useState([]);
  const [x1, setX1] = useState();
  const [y1, setY1] = useState();
  const [x2, setX2] = useState();
  const [y2, setY2] = useState();
  const [x3, setX3] = useState();
  const [y3, setY3] = useState();
  const [x4, setX4] = useState();
  const [y4, setY4] = useState();
  const [x5, setX5] = useState();
  const [y5, setY5] = useState();
  const [x6, setX6] = useState();
  const [y6, setY6] = useState();

  const connectServer = async(event) =>{
    const conSer = [x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6]
    console.log(conSer)
    event.preventDefault();

    try{
        const response = await fetch('http://localhost:8080/api/mousePosition', {
            method:'POST',
            headers:{
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
              x1:x1, y1:y1,
              x2:x2, y2:y2,
              x3:x3, y3:y3,
              x4:x4, y4:y4,
              x5:x5, y5:y5,
              x6:x6, y6:y6,
              }),
          });
        if(!response.ok){
            throw new Error('login error');
        }
        const result = await response.json();
        if(result === '전달성공'){
            console.log("success")
           
        };                
        
    } catch(error){
        console.log(error);
    }

};   
const resetlocation = () =>{
    document.getElementById("formid").reset();
    setClickCoordinates([]);
    setX1("");
    setY1("");
    setX2("");
    setY2("");
    setX3("");
    setY3("");
    setX4("");
    setY4("");
    setX5("");
    setY5("");
    setX6("");
    setY6("");

  }  
  useEffect(() => {

    const handleMouseMove = (event) => {
      const { clientX, clientY } = event;
      setCoordinates({ x: clientX, y: clientY });
    };
    const handleMouseClick = (event) => {
        const { clientX, clientY } = event;
        const clickCoordinate = { x: clientX, y: clientY };
        setClickCoordinates((prevCoordinates) => [...prevCoordinates, clickCoordinate]);
      };
    if (isTracking) {
      window.addEventListener('mousemove', handleMouseMove);
      window.addEventListener('click', handleMouseClick);
    } else {
      window.removeEventListener('mousemove', handleMouseMove);
      window.removeEventListener('click', handleMouseClick);
    }

    return () => {
      window.removeEventListener('mousemove', handleMouseMove);
      window.removeEventListener('click', handleMouseClick);
    };
  }, [isTracking]);

  const startTracking = () => {
    setIsTracking(true);
  };

  const stopTracking = () => {
    setIsTracking(false);
  };
  
  const storage = (e) =>{
    if (e.target.name =="x1"){
        setX1(e.target.value);
    } else if (e.target.name === "y1"){
        setY1(e.target.value);
    } else if (e.target.name === "x2"){
        setX2(e.target.value);
    } else if (e.target.name === "y2"){
        setY2(e.target.value);
    } else if (e.target.name === "x3"){
        setX3(e.target.value);
    } else if (e.target.name === "y3"){
        setY3(e.target.value);
    } else if (e.target.name === "x4"){
        setX4(e.target.value);
    } else if (e.target.name === "y4"){
        setY4(e.target.value);
    } else if (e.target.name === "x5"){
        setX5(e.target.value);
    } else if (e.target.name === "y5"){
        setY5(e.target.value);
    } else if (e.target.name === "x6"){
        setX6(e.target.value);
    } else if (e.target.name === "y6"){
        setY6(e.target.value);    
     }
    }
  return (
    <div>
      <button onClick={startTracking}>마우스 위df치 추적 시작</button>
      <button onClick={stopTracking}>마우스 위치 추적 중지</button>
      <button onClick={resetlocation}>reset</button>
      <p>X 좌표: {coordinates.x}</p>
      <p>Y 좌표: {coordinates.y}</p>
      <h2>마우스 클릭 좌표</h2>
      <ul>
        {clickCoordinates.map((clickCoordinate, index) => (
          <li key={index}>
            클릭 {index + 1}: X 좌표 - {clickCoordinate.x}, Y 좌표 - {clickCoordinate.y}
          </li>
        ))}
      </ul>
      <div className='inputMain'>
      <form id='formid' onSubmit={connectServer}>
        <div className='in01'>
            <input className='input1' type='number' name='x1' onChange={storage}></input>
            <input className='input1' type='number' name='y1' onChange={storage}></input>
        </div>
        <div className='in01'>
            <input className='input2' type='number' name='x2' onChange={storage}></input>
            <input className='input2' type='number' name='y2' onChange={storage}></input>
        </div>
        <div className='in01'>
            <input className='input3' type='number' name='x3' onChange={storage}></input>
            <input className='input3' type='number' name='y3' onChange={storage}></input>
        </div>
        <div className='in01'>
            <input className='input4' type='number' name='x4' onChange={storage}></input>
            <input className='input4' type='number' name='y4' onChange={storage}></input>
        </div>
        <div className='in01'>
            <input className='input5' type='number' name='x5' onChange={storage}></input>
            <input className='input5' type='number' name='y5' onChange={storage}></input>
        </div>
        <div className='in01'>
            <input className='input6' type='number' name='x6' onChange={storage}></input>
            <input className='input6' type='number' name='y6' onChange={storage}></input>
        </div>
        <button type='submit'>click</button>
      </form>
      </div>
    </div>
  );
};


export default MouseCoordinates;