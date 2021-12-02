import logo from './logo.svg';
import './App.css';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Login from "./containers/Login";
import Home from "./containers/Home";
import UserManagement from "./containers/UserManagement";

function App() {
  return (
    <Router>
      <div>
        <Link to="/">Login</Link>
        <Link to="/Home">Home</Link>
        <Link to="/Users">User Management</Link>
      </div>

      <hr />

      <Routes>
        <Route exact path="/" element={<Login/>}>
        </Route>
        <Route exact path="/Home" element={<Home/>}>
        </Route>
        <Route exact path="/Users" element={<UserManagement/>}>
        </Route>
      </Routes>
    </Router>
  );
}

export default App;
