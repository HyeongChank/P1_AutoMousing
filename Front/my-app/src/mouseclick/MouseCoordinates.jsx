
import './MainCs.css'
import Inputboxmain from './Inputboxmain';
import { useNavigate } from 'react-router-dom';

const MouseCoordinates = () => {

  const navigate = useNavigate();
  function goinfo (){
    console.log("goinfo")
    navigate('/info');
    return null; // 페이지 이동 이후 렌더링 중단
}
    return (
      
      <div>
        <div className='backgroundurl'>
        <h1>화면 자동 클릭 웹서비스</h1>
        <div>
          <div className='mainpagelist'>
              <button onClick={goinfo} className="btn-hover color-9">사용법</button>
            <Inputboxmain/>
          </div>
        </div>
        </div>
      </div>
    );
};


export default MouseCoordinates;