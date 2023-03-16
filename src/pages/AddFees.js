import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate,Link } from 'react-router-dom'

export default function AddFees() {

    let navigate = useNavigate();

    const [user , setUser] = useState( {
        name:"",
        totalFeesForStudent:45000,
        paymentMode:"",
        totalPaidFeesForStudent:"",
        outstandingFees:0,
        paidDate:"",

        clgId:"",
        clgName:"",
        clgAddress:"",
        depatmentName:"",
    });

    const {name ,paymentMode,totalFeesForStudent,outstandingFees,totalPaidFeesForStudent,paidDate,clgId,clgName,clgAddress,depatmentName} = user;

    const onInputChange = (e) => {
        setUser({...user, [e.target.name]:e.target.value});
    };

    // const calculateOutstandingFees = () => {
    //  const outFees = totalFeesForStudent - totalPaidFeesForStudent;
    //   setOutstandingFees(outFees);
    // };
  
    const onSubmit = async (e) =>{
        e.preventDefault();
        // setUser({ ...user, outstandingFees: outstandingFees });
        await axios.post("http://localhost:9088/api/fees/add",user);
        navigate("/");
        alert("Fees Added in "+name)
    }

  return (
    <div className='container'>
    <div className='row'>
        <div className='col-sm-6 offset-md-3 border bg-secondary rounded shadow'>
        <h1 className='text-center form-control-lg'>Add Fees To Student</h1>
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
              <label htmlFor="clgName" className="form-label">
                College Name
              </label>
              <input
                type={"text"}
                className="form-control"
                placeholder="Enter your ColleName"
                name="clgName"
                value={clgName}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="clgId" className="form-label">
                College ID
              </label>
              <input
                type={"clgId"}
                className="form-control"
                placeholder="Enter your college ID"
                name="clgId"
                value={clgId}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="clgAddress" className="form-label">
                College Location
              </label>
              <input
                type={"clgAddress"}
                className="form-control"
                placeholder="Enter location"
                name="clgAddress"
                value={clgAddress}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="depatmentName" className="form-label">
               Department
              </label>
              <input
                type={"text"}
                className="form-control"
                placeholder="Enter your Department"
                name="depatmentName"
                value={depatmentName}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            
            <div className="mb-3">
              <label htmlFor="totalFeesForStudent" className="form-label">
               Total Fees
              </label>
              <input
                type={"number"}
                className="form-control"
                placeholder="Enter your Fees"
                name="totalFeesForStudent"
                value={totalFeesForStudent}
                onChange={(e) => onInputChange(e)}
              />
            </div>
               
            <div className="mb-3">
              <label htmlFor="totalPaidFeesForStudent" className="form-label">
               Paid Fees
              </label>
              <input
                type={"number"}
                className="form-control"
                placeholder="totalPaidFeesForStudent"
                name="totalPaidFeesForStudent"
                value={totalPaidFeesForStudent}
                onChange={(e) => onInputChange(e)}
              />
            </div>
                  
            <div className="mb-3">
              <label htmlFor="paymentMode" className="form-label">
               Payment Mode
              </label>
              <input
                type={"paymentMode"}
                className="form-control"
                placeholder="Enter mode of payment"
                name="paymentMode"
                value={paymentMode}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <div class="mb-3">
           <label for="formFile" class="form-label">Upload Fee Receipt</label>
              <input class="form-control" type="file" id="formFile"/>
              </div>  

            <div className="mb-3">
              <label htmlFor="paidDate" className="form-label">
               Paid Date
              </label>
              <input
                type={"date"}
                className="form-control"
                placeholder="Date"
                name="paidDate"
                value={paidDate}
                onChange={(e) => onInputChange(e)}
              />
            </div>

            <div className="mb-3">
              <label htmlFor="outstandingFees" className="form-label">
               Outstanding Fees
              </label>
              <input
                type={"number"}
                className="form-control"
                placeholder="outstandingFees"
                name="outstandingFees"
                value={outstandingFees}
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
