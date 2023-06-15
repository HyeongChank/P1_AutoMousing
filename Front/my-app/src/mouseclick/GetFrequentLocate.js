import {useState} from "react";

const GetFrequentLocate = () =>{
    const [checkname, setCheckname] = useState();
    const [frequentxy, setFrequentxy] = useState([]);
    const handlename = (e)=>{
        if(e.target.name === "cn"){
            setCheckname(e.target.value)
        }

    }
    
    const getlocatexy = async(event)=>{
        event.preventDefault();
        try{
            const response = await fetch('http://localhost:8080/api/getfrequentlocation',{
                method: 'POST',
                headers:{
                    'Content-Type':'text/plain',
                },
                body:checkname
                
            })
            const result = await response.json();
            setFrequentxy(result)
            console.log(result);
        }
        catch(error){
            console.log(error);
     }}

    return(
        <div className="getfreauentpage">
            <h2 id="getlocateP">좌표 불러오기</h2>
            <input type='text' name='cn' onChange={handlename}/>
            <button onClick={getlocatexy}>좌표 가져오기</button>
            <div>
                {Object.entries(frequentxy).map(([key, value], index) =>(
                    <div key={index}>
                        {key} : {value !==null ? value : ''}
                    </div>
                ))}
            </div>
        </div>
    )
}
export default GetFrequentLocate;