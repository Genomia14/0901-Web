import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import "./App.css";
import AvatarTest from "./pages/AvatarTest";
import DisplayNoneTest from "./pages/DisplayNoneTest";
import DisplayTest from "./pages/DisplayTest";
import DivTest from "./pages/DivTest";
import HeightTest from "./pages/HeightTest";
import ImageTest from "./pages/ImageTest";
import MarginTest from "./pages/MarginTest";
import OverlayTest from "./pages/OverlayTest";
import PaddingTest from "./pages/PaddingTest";
import PositionTest from "./pages/PositionTest";
import ViewportTest from "./pages/ViewportTest";
import BackgroundImageTest from "./pages/BackgroundTest";

export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="*" element={<OverlayTest />} />
        <Route path="/1" element={<PositionTest />} />
        <Route path="/2" element={<DisplayNoneTest />} />
        <Route path="/3" element={<DisplayTest />} />
        <Route path="/4" element={<AvatarTest />} />
        <Route path="/5" element={<BackgroundImageTest />} />
        <Route path="/6" element={<ImageTest />} />
        <Route path="/7" element={<MarginTest />} />
        <Route path="/8" element={<PaddingTest />} />
        <Route path="/9" element={<HeightTest />} />
        <Route path="/10" element={<ViewportTest />} />
        <Route path="/11" element={<DivTest />} />
      </Routes>
      <div>
        <Link to="*">OverlayTest</Link> / <Link to="/1">PositionTest</Link> /
        <Link to="/2">DisplayNoneTest</Link> / <Link to="/3">DisplayTest</Link>/
        <Link to="/4">AvatarTest</Link> /
        <Link to="/5">BackgroundImageTest</Link> /<Link to="/6">ImageTest</Link>
        /<Link to="/7">MarginTest</Link> / <Link to="/8">PaddingTest</Link> /
        <Link to="/9">HeightTest</Link> / <Link to="/10">ViewportTest</Link> /
        <Link to="/11">DivTest</Link> /
      </div>
    </BrowserRouter>
  );
}
