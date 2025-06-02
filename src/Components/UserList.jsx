import React, { useEffect, useState } from 'react';
import { getAllUsers, deleteUser } from '../Services/userService';
import { useNavigate } from 'react-router-dom';

function UserList() {
  const [users, setUsers] = useState([]);
  const [error, setError] = useState('');
  const [loading, setLoading] = useState(true);
  const navigate = useNavigate();

  useEffect(() => {
    fetchUsers();
  }, []);

  const fetchUsers = () => {
    getAllUsers()
      .then((response) => {
        setUsers(response.data);
        setLoading(false);
      })
      .catch(() => {
        setError('Failed to fetch users from backend');
        setLoading(false);
      });
  };

  const handleDelete = (id) => {
    if (window.confirm('Are you sure to delete this user?')) {
      deleteUser(id).then(fetchUsers).catch(() => alert('Delete failed'));
    }
  };

  return (
    <div className="container mt-5">
      <div className="card shadow">
        <div className="card-header bg-primary text-white d-flex justify-content-between align-items-center">
          <h4 className="mb-0">User List</h4>
          <button className="btn btn-light" onClick={() => navigate('/add-user')}>
            + Add User
          </button>
        </div>
        <div className="card-body">
          {loading && <div className="alert alert-info">Loading users...</div>}
          {error && <div className="alert alert-danger">{error}</div>}

          {!loading && users.length > 0 ? (
            <div className="table-responsive">
              <table className="table table-bordered table-hover mt-3">
                <thead className="table-dark">
                  <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Password</th>
                    <th>Type</th>
                    <th>Actions</th>
                  </tr>
                </thead>
                <tbody>
                  {users.map((user) => (
                    <tr key={user.id}>
                      <td>{user.id}</td>
                      <td>{user.name}</td>
                      <td>{user.password}</td>
                      <td>{user.type}</td>
                      <td>
                        <button
                          className="btn btn-info btn-sm me-2"
                          onClick={() => navigate(`/edit-user/${user.id}`)}
                        >
                          Update
                        </button>
                        <button
                          className="btn btn-danger btn-sm"
                          onClick={() => handleDelete(user.id)}
                        >
                          Delete
                        </button>
                      </td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
          ) : (
            !loading && <div className="alert alert-warning">No users found</div>
          )}
        </div>
      </div>
    </div>
  );
}

export default UserList;
