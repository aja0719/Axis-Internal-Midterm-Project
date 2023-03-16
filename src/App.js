
import './App.css';
import  "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import { BrowserRouter as Router , Routes ,Route } from 'react-router-dom'; 
import StudentRegister from './pages/StudentRegister';
import EditUser from './Admin/EditUser';
import AddFees from './pages/AddFees';
import ViewFees from './Admin/ViewFees';

function App() {
  return (
    <div className="App">
  
  <Router>
  <Navbar/>
  <Routes >
    <Route exact path='/home'element={<Home/>}/>

    <Route exact path='/studentRegister'element={<StudentRegister/>}/>

    <Route exact path='/edituser/:id'element={<EditUser/>}/>
    <Route exact path='/addFees'element={<AddFees/>}/>

    <Route exact path='/viewFees/:name'element={<ViewFees/>}/>
    
  </Routes>
  </Router>  
    </div>
  );
}

export default App;
