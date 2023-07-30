import { BrowserRouter, Route, Routes } from "react-router-dom";
import MouseCoordinates from "./MouseCoordinates";
import Info from "./Info";
import RouteNv from "./RouteNv";

const Routemain = () => {
  return (
    <>
      <RouteNv />
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<MouseCoordinates />} />
          <Route path="/info" element={<Info/>}/>
        </Routes>
      </BrowserRouter>
    </>
  );
};

export default Routemain;