import React from 'react'
import { Link } from 'react-router-dom'

export default function Navbar() {
  
  return (
    <nav className="navbar navbar-expand-lg bg-secondary fw-bold fs-6 ">
      <div className="container-fluid accordion-flush me-4">
      <div style={{ display: 'flex', alignItems: 'center' }}>
      <img src={process.env.PUBLIC_URL + '/referenceImage.png'} alt="referenceImage" height="50" width="60" style={{ marginRight: '20px' , marginLeft:'60px' }}/>
    </div>
        <a className="navbar-brand fs-10 fs-lg-5 fw-bold me-2" href="#" style={{ fontSize: "2.5rem" }}>FeesDB</a>
        <button className="navbar-toggler" 
          type="button me-auto" 
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent" 
          aria-controls="navbarSupportedContent" 
          aria-expanded="false" 
          aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span> 
        </button>

        <div className="ms-auto">
          <Link className="btn btn-outline-light me-2" to="/home">Admin</Link> 
          <Link className="btn btn-outline-light me-2" to="/addFees">Student</Link> 
          <Link className="btn btn-outline-light me-2" to="/studentRegister">Student Registration</Link>
        </div>
      </div>
    </nav>
  )
}
