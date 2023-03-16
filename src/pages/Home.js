import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom';

export default function Home() {
    const [users , setUsers] = useState([]);
    const {id} = useParams();

    useEffect (() => {
       loadUsers();
       findUser();
       deleteUsers();
    } , []);

    const loadUsers = async () =>{
        const res = await axios.get("http://localhost:9088/api/admin/All studs")
        setUsers(res.data);
    }

    const findUser = async() => {
      const res = await axios.get(`http://localhost:9088/api/both/${id}`)
      setUsers(res.data);
      console.log(res);
  } 

    const deleteUsers= async(id) => {
      await axios.delete(`http://localhost:9088/api/admin/deleteStudent/${id}`)
      loadUsers();
      alert("Student is deleted");
    }

    
  return (
    <div className='container '>
         <div className='py-4'> 
         <table className="table border shadow">
  <thead>
    <tr>
      <th scope="col">Student ID</th>
      <th scope="col">Name</th>
      <th scope="col">Gender</th>
      <th scope="col">DOB</th>
      <th scope="col">Admission Date</th>
      <th scope="col">Year of Study</th>
      <th scope="col">Contact</th>
      <th scope="col">Email</th>
      {/* <th scope="col">Password</th> */}
    </tr>
  </thead>
  <tbody>

    {
      users.map((user , index)  => (
      <tr>
      {/* <th scope="row"  key={index}>{index+1}</th> */}
      <td>{user.id}</td>
      <td>{user.name}</td>
      <td>{user.gender}</td>
      <td>{user.dob}</td>
      <td>{user.dateOfAdmission}</td>
      <td>{user.yearOfStudy}</td>
      <td>{user.contact}</td>
      <td>{user.email}</td>
      {/* <td>{user.password}</td> */}
       <td> 
       <Link className='btn btn-primary btn-sm btn-space text-sm me-2' to={`/viewfees/${user.name}`}>View Fees</Link>
      <button className='btn btn-danger btn-sm btn-space text-sm me-2' onClick={()=> deleteUsers(user.id)}>Delete</button>
      <Link className='btn btn-info btn-sm btn-space text-sm me-2'  to={`/edituser/${user.id}`}> Edit </Link>
      </td>
    </tr>
))}
  </tbody>
</table>          
  </div>
    </div>
  )
}
