import React, { useEffect, useState } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import { getUserById, updateUser } from '../Services/userService';

function UpdateUser() {
  const { id } = useParams();
  const [user, setUser] = useState({ name: '', password: '', type: '' });
  const navigate = useNavigate();

  useEffect(() => {
    getUserById(id)
      .then((res) => setUser(res.data))
      .catch(() => alert('User not found'));
  }, [id]);

  const handleChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    updateUser(id, user)
      .then(() => navigate('/users'))
      .catch(() => alert('Update failed'));
  };

  return (
    <div className="container mt-5">
      <div className="row justify-content-center">
        <div className="col-md-6">
          <div className="card shadow">
            <div className="card-header bg-primary text-white">
              <h4 className="mb-0 text-center">Update User</h4>
            </div>
            <div className="card-body">

              <form onSubmit={handleSubmit}>
                <div className="mb-3">
                  <label>Name:</label>
                  <input type="text" name="name" value={user.name} className="form-control" onChange={handleChange} required />
                </div>
                <div className="mb-3">
                  <label>Password:</label>
                  <input type="password" name="password" value={user.password} className="form-control" onChange={handleChange} required />
                </div>
                <div className="mb-3">
                  <label>Type:</label>
                  <input type="text" name="type" value={user.type} className="form-control" onChange={handleChange} required />
                </div>
                <button type="submit" className="btn btn-success w-100">Update</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>


  );
}

export default UpdateUser;
