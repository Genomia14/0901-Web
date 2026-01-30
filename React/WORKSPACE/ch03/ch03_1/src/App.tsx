import Bootstrap from "./pages/Bootstrap";
import Icon from "./pages/Icon";
import Style from "./pages/Style";
import UsingIcon from "./pages/UsingIcon";
import UsingIconWithCSSClass from "./pages/UsingIconWithCSSClass";
import "./App.css";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";

export default function App() {
  // <div>
  //   <UsingIconWithCSSClass />
  //   <UsingIcon />
  //   <Style />
  //   <Icon />
  //   <Bootstrap />
  // </div>;

  return (
    <BrowserRouter>
      <Routes>
        <Route path="*" element={<UsingIconWithCSSClass />} />
        <Route path="/1" element={<UsingIcon />} />
        <Route path="/2" element={<Style />} />
        <Route path="/3" element={<Icon />} />
        <Route path="/4" element={<Bootstrap />} />
      </Routes>
      <div>
        <Link to="*"> UsingIconWithCSSClass</Link> /
        <Link to="/1"> UsingIcon</Link> /<Link to="/2"> Style</Link> /
        <Link to="/3"> Icon</Link> /<Link to="/4"> Bootstrap</Link> /
      </div>
    </BrowserRouter>
  );
}
