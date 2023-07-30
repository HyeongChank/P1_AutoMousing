import { Link, Routes, Route} from "react-router-dom";

const RouteNv = () => {
  return (
    <nav>

      <Routes>
        <Route path="/" element={<Link to="/info">사용법</Link>} />
        <Route path="/info" element={<Link to="/">home</Link>} />
      </Routes>

    </nav>
  );
};

export default RouteNv;
