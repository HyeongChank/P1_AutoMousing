import { useNavigate } from "react-router-dom"

const MenuBar = () =>{

    const navigate = useNavigate();
    const goinfo = ()=>{
        navigate('/p');
    }
    return(
        <div>
            <div>
                <button onClick={goinfo}>사용법</button>
            </div>
        </div>
    )
}
export default MenuBar