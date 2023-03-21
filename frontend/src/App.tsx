import "./App.css";
import router from "@/pages/router";
import { useRoutes } from "react-router-dom";
import { Header } from "./components/header/Header";
import { Broadcast } from "./components/broadcast/Broadcast";

function App() {
  const element = useRoutes(router);
  return (
    <div className="App">
      <Header />
      <Broadcast />
      {element}
    </div>
  );
}

export default App;