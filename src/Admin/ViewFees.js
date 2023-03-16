import React, {useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';
import axios from 'axios'


export default function ViewFees() {

    const [users , setUsers] = useState([]);

    const{name} = useParams();

    useEffect(() => {
      findUser();
    })

    const findUser = async() => {
      const res = await axios.get(`http://localhost:9088/api/fees/${name}`)
      setUsers(res.data);
      console.log(res);
  } 

  
  return (    
    <div className='container'>
         <div className='py-4'> 
         <table className="table border shadow">
          <thead>
          <tr>
      {/* <th scope="col">Student ID</th> */}
      <th scope="col">Name</th>
      <th scope="col">College Id</th>
      <th scope="col">College Name</th>
      <th scope="col">Location</th>
      <th scope="col">Department</th>
      <th scope="col">Total Fees</th>
      <th scope="col">Paid Fees</th>
      <th scope="col">Payment Mode</th>
      <th scope="col">Paid Date</th>
      <th scope="col">Outstanding Fees</th>
    </tr>
  </thead>
  <tbody>
    {
      users.map((user , index)  => (
      <tr>
      {/* <th scope="row"  key={index}>{index+1}</th> */}
      {/* <td>{user.id}</td> */}
      <td>{user.name}</td>
      <td>{user.clgId}</td>
      <td>{user.clgName}</td>
      <td>{user.clgAddress}</td>
      <td>{user.depatmentName}</td>
      <td>{user.totalFeesForStudent}</td>
      <td>{user.totalPaidFeesForStudent}</td>
      <td>{user.paymentMode}</td>
      <td>{user.paidDate}</td>
      <td>{user.outstandingFees}</td>
       <td> 
      </td>
    </tr>
))}
  </tbody>
</table>          
  </div>
    </div>
  )}
