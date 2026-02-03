import { BrowserRouter, Link, Route, Routes } from "react-router-dom";

import Clock from "./pages/Clock";

export default function App() {
  return (
    <BrowserRouter>
      <div>
        <Link to="*">Clock</Link>
      </div>
      <Routes>
        <Route path="*" element={<Clock />} />
      </Routes>
    </BrowserRouter>
  );
}
