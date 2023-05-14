import React, { useState, useEffect } from 'react';
import './MainCs.css'


const Inputboxmain = () => {
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
    const [interval1, setInterval1] = useState();
    const [interval2, setInterval2] = useState();
    const [interval3, setInterval3] = useState();
    const [interval4, setInterval4] = useState();
    const [interval5, setInterval5] = useState();
    const [interval6, setInterval6] = useState();
    const [roop, setRoop] = useState();
    const [indb, setIndb] = useState();

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
                  interval1:interval1,
                  interval2:interval2,
                  interval3:interval3,
                  interval4:interval4,
                  interval5:interval5,
                  interval6:interval6,
                  roop:roop,
                  indb:indb
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
        if (e.target.name ==="x1"){
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
        } else if (e.target.name === "interval1"){
            setInterval1(e.target.value);    
        } else if (e.target.name === "interval2"){
            setInterval2(e.target.value);    
        } else if (e.target.name === "interval3"){
            setInterval3(e.target.value);    
        } else if (e.target.name === "interval4"){
            setInterval4(e.target.value);    
        } else if (e.target.name === "interval5"){
            setInterval5(e.target.value);    
        } else if (e.target.name === "interval6"){
            setInterval6(e.target.value);
        } else if (e.target.name === "roop"){
            setRoop(e.target.value);        
        // } else if (e.target.name === "indb"){
        //     setIndb(e.target.checked);        
        // }
        };
        // const storagecheck = (e) =>{
        //     setIndb();    
        // }
        
    }
    const testclick = ()=>{
        console.log("test")
    }
    return (
        <div className='controll'>
        <div className='mainpage'>
            <div className='outputmain'>
                <div>
                <button onClick={startTracking} className="btn-hover color-9">마우스 위치 추적 시작</button>
                <button onClick={stopTracking} className="btn-hover color-9">마우스 위치 추적 중지</button>
                <button onClick={resetlocation} className="btn-hover color-10">reset</button>
                <p>X 좌표: {coordinates.x}</p>
                <p>Y 좌표: {coordinates.y}</p>
                <h2>마우스 클릭 좌표</h2>
                <ul>
                    {clickCoordinates.map((clickCoordinate, index) => (
                    <li key={index} id='litype'> 클릭 {index + 1}: X 좌표 - {clickCoordinate.x}, Y 좌표 - {clickCoordinate.y}
                    </li>
                    ))}
                </ul>
                </div>
            </div>
            <div className='inputMain'>
            <div>
            <form id='formid' onSubmit={connectServer}>
                <div className='in01'>
                    <p>마우스 좌표 및 대기시간 입력</p>
                </div>
                <div className='in01'>
                    <span id='span01'>첫번째 클릭 </span>
                    <input className='input1' type='text' name='x1' onChange={storage} placeholder='X 좌표'></input>
                    <input className='input1' type='text' name='y1' onChange={storage} placeholder='Y 좌표'></input>
                    <input className='input1' type='text' name='interval1' onChange={storage} placeholder='Interval Time'></input>
                </div>
                <div className='in01'>
                    <span id='span01'>두번째 클릭 </span>
                    <input className='input2' type='text' name='x2' onChange={storage} placeholder='X 좌표'></input>
                    <input className='input2' type='text' name='y2' onChange={storage} placeholder='Y 좌표'></input>
                    <input className='input2' type='text' name='interval2' onChange={storage} placeholder='Interval Time'></input>
                </div>
                <div className='in01'>
                    <span id='span01'>세번째 클릭</span>
                    <input className='input3' type='text' name='x3' onChange={storage} placeholder='X 좌표'></input>
                    <input className='input3' type='text' name='y3' onChange={storage} placeholder='Y 좌표'></input>
                    <input className='input3' type='text' name='interval3' onChange={storage} placeholder='Interval Time'></input>
                </div>
                <div className='in01'>
                    <span id='span01'>네번째 클릭</span>
                    <input className='input4' type='text' name='x4' onChange={storage} placeholder='X 좌표'></input>
                    <input className='input4' type='text' name='y4' onChange={storage} placeholder='Y 좌표'></input>
                    <input className='input4' type='text' name='interval4' onChange={storage} placeholder='Interval Time'></input>
                </div>
                <div className='in01'>
                    <span id='span01'>다섯번째 클릭</span>
                    <input className='input5' type='text' name='x5' onChange={storage} placeholder='X 좌표'></input>
                    <input className='input5' type='text' name='y5' onChange={storage} placeholder='Y 좌표'></input>
                    <input className='input5' type='text' name='interval5' onChange={storage} placeholder='Interval Time'></input>
                </div>
                <div className='in01'>
                    <span id='span01'>여섯번째 클릭</span>
                    <input className='input6' type='text' name='x6' onChange={storage} placeholder='X 좌표'></input>
                    <input className='input6' type='text' name='y6' onChange={storage} placeholder='Y 좌표'></input>
                    <input className='input6' type='text' name='interval6' onChange={storage} placeholder='Interval Time'></input>
                </div>
                <div className='in01'>
                    <span id='span01'>반복 횟수(text of Repetitions) </span>
                    <input className='roop' type='text' name='roop' onChange={storage}></input>
                    {/* <form id='formcheck' onSubmit={storagecheck}>
                        <input type="checkbox" name='indb'/>
                        <button type='submit'>좌표 저장</button>
                    </form> */}
                    <button type='submit' className="btn-hover color-9">반복 시작(Start)</button>
                </div>
                {/* <MouseCoordinates macroinfo = {{x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,interval1, interval2, interval3, interval4, interval5, interval6, roop}}/> */}
            </form>
            </div>
                <button onClick={testclick}>test</button>
            </div>
        </div>
        </div>
    );
};


export default Inputboxmain;