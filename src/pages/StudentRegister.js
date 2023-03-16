import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate,Link } from 'react-router-dom'

export default function StudentRegister() {

    let navigate = useNavigate();

    const [user , setUser] = useState( {
        name:"",
        gender:"",
        dob:"",
        dateOfAdmission:"",
        yearOfStudy:"",
        contact:"",
        email:"",
        password:"",
    });

    const {name , gender , dob,dateOfAdmission,yearOfStudy,contact,email,password} = user;

    const onInputChange = (e) => {
        setUser({...user, [e.target.name]:e.target.value});
    };

    const onSubmit = async (e) =>{
        e.preventDefault();
        await axios.post("http://localhost:9088/api/student/register",user);
        navigate("/");
        alert("Student Registered")
    }

  return (
    <div className='container'>
    <div className='row'>
        <div className='col-sm-6 offset-md-3 border rounded shadow'>
        <h1 className='text-center form-control-lg'>Student Registration</h1>
        <form onSubmit={(e) => onSubmit(e)}>
            <div className="mb-3">
              <label htmlFor="Name" className="form-label ml-auto">
                Name
              </label>
              <input
                type={"text"}
                className="form-control"
                placeholder="Enter your name"
                name="name"
                value={name}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="gender" className="form-label">
                Gender
              </label>
              <input
                type={"text"}
                className="form-control"
                placeholder="Enter your gender"
                name="gender"
                value={gender}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="dob" className="form-label">
                DOB
              </label>
              <input
                type={"date"}
                className="form-control"
                placeholder="Enter your dob"
                name="dob"
                value={dob}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="dob" className="form-label">
                Admission Date
              </label>
              <input
                type={"date"}
                className="form-control"
                placeholder="Enter date of Admission"
                name="dateOfAdmission"
                value={dateOfAdmission}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="YearOfStudy" className="form-label">
               YearOfStudy
              </label>
              <input
                type={"text"}
                className="form-control"
                placeholder="Enter your YearOfStudy"
                name="yearOfStudy"
                value={yearOfStudy}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            
            <div className="mb-3">
              <label htmlFor="Contact" className="form-label">
               Contact No.
              </label>
              <input
                type={"text"}
                className="form-control"
                placeholder="Enter your contact no."
                name="contact"
                value={contact}
                onChange={(e) => onInputChange(e)}
              />
            </div>
                  
            <div className="mb-3">
              <label htmlFor="Email" className="form-label">
               Email
              </label>
              <input
                type={"email"}
                className="form-control"
                placeholder="Enter your Email Id"
                name="email"
                value={email}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            
            <div className="mb-3">
              <label htmlFor="Password" className="form-label">
               Password
              </label>
              <input
                type={"password"}
                className="form-control"
                placeholder="Enter password"
                name="password"
                value={password}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <button type="submit" className="btn btn-outline-primary">
              Submit
            </button>

            <Link className="btn btn-outline-danger mx-2" to="/">
              Cancel
            </Link>
          </form>
        </div>
    </div>
    </div>

  )
}
