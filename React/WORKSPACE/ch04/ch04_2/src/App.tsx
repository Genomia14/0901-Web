import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import HighOrderCallback from "./pages/HighOrderCallback";
import Callback from "./pages/Callback";
import Memo from "./pages/Memo";
import UseOrCreateTest from "./pages/UseOrCreateTest";

export default function App() {
  return (
    <BrowserRouter>
      <div>
        <Link to="*">HighOrderCallback</Link> | <Link to="/1">Callback</Link> |{" "}
        <Link to="/2">Memo</Link> | <Link to="/3">UserOrCreateTest</Link>
      </div>
      <Routes>
        <Route path="*" element={<HighOrderCallback />} />|
        <Route path="/1" element={<Callback />} />
        <Route path="/2" element={<Memo />} />
        <Route path="/3" element={<UseOrCreateTest />} />
      </Routes>
    </BrowserRouter>
  );
}
