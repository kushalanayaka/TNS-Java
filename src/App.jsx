import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import UserList from './Components/UserList';
import AddUser from './Components/AddUser';
import UpdateUser from './Components/UpdateUser';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Navigate to="/users" />} />
        <Route path="/users" element={<UserList />} />
        <Route path="/add-user" element={<AddUser />} />
        <Route path="/edit-user/:id" element={<UpdateUser />} />
        <Route path="*" element={<div className="container mt-4"><h2>404 - Page not found</h2></div>} />
      </Routes>
    </Router>
  );
}

export default App;
