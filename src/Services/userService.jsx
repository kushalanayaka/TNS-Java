import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/users';

// GET all users
export const getAllUsers = () => {
  return axios.get(`${API_BASE_URL}/all`);
};

// GET a single user by ID
export const getUserById = (id) => {
  return axios.get(`${API_BASE_URL}/${id}`);
};

// POST a new user
// Backend expects POST to /users/register
export const createUser = (user) => {
  return axios.post(`${API_BASE_URL}/register`, user);
};

// PUT update an existing user
// Backend expects PUT to /users/update (no id in path, id comes in user object)
export const updateUser = (id, user) => {
  // Ensure user object has the correct id before sending
  user.id = id;
  return axios.put(`${API_BASE_URL}/update`, user);
};

// DELETE a user by ID
// Backend expects DELETE to /users/{id}
export const deleteUser = (id) => {
  return axios.delete(`${API_BASE_URL}/${id}`);
};
