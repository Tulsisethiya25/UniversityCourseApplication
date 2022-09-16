import React, { Component } from 'react'
import loginService from '../services/loginService';

class StaffLogin extends React.Component {
    constructor(props) {
      super(props);
  
      this.state = {
        fields: {},
        errors: {},
      };
    }
  
    handleValidation() {
      let fields = this.state.fields;
      let errors = {};
      let formIsValid = true;
  
      //Name
      if (!fields["StaffId"]) {
        formIsValid = false;
        errors["StaffId"] = "Cannot be empty";
      }
       //Name
       if (!fields["password"]) {
        formIsValid = false;
        errors["password"] = "Cannot be empty";
      }
   
   
      this.setState({ errors: errors });
      return formIsValid;
    }
      
    contactSubmit(e) {
      e.preventDefault();
      let fields = this.state.fields;
      if (this.handleValidation()) {
        let loginDetails={loginId:fields["StaffId"],password:fields["password"]}
        console.log(loginDetails);
        loginService.loginStaff(loginDetails).then( res => {
          console.log(res);
          if(res.data==="staff successfully Login"){
          localStorage.setItem('StaffId', loginDetails.loginId);
          localStorage.setItem('Staffpassword', loginDetails.password);
          window.open("/StaffProfile", "_self");
          }
          else
          alert("Login Failed please enter correct Id & Password");
         });
        } else {
        alert("Form has errors.");
      }
    }
  
    handleChange(field, e) {
      let fields = this.state.fields;
      fields[field] = e.target.value;
      this.setState({ fields });
    }
  
    render() {
      return (
        <div>
            <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                            <br></br>
                            <h2 className="text-center">Applicant Login</h2>
                 
                                <div className = "card-body">
            
          <form
            name="contactform"
            className="contactform"
            onSubmit={this.contactSubmit.bind(this)}
          >
            {/* <div className="col-md-6"> */}
            <div className = "form-group">
           
              <fieldset>
              <label> Staff Id </label>
              
                <input
                  ref="StaffId"
                  placeholder="StaffId"
                  className="form-control"
                  
                  onChange={this.handleChange.bind(this, "StaffId")}
                  value={this.state.fields["StaffId"]}
                />
                <span style={{ color: "red" }}>{this.state.errors["StaffId"]}</span>
                <br />
                <label>Password</label>
           
                <input
                  refs="password"
                  placeholder="password"
                  className="form-control"
                  
                  onChange={this.handleChange.bind(this, "password")}
                  value={this.state.fields["password"]}
                />
                <span style={{ color: "red" }}>{this.state.errors["password"]}</span>
                <br />
                <button style={{marginLeft: "10px"}} className="btn btn-dark" >Login</button>

                <br />
              </fieldset>
            </div>
          </form>
          <br></br>
          <button style={{marginLeft: "10px"}} className="btn btn-dark"  onClick={() => {window.open("/home", "_self")}}>back</button>

          </div>
          </div>
          </div>
          </div>
        </div>
      );
    }
  }
  export default StaffLogin