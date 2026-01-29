import { BrowserRouter } from "react-router-dom";
import RouterSetup from "./RouterSetup";

function App() {
  return (
    <div>
      <BrowserRouter>
        <RouterSetup />
      </BrowserRouter>
    </div>
  );
}
export default App;
