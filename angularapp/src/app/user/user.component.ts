import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../service/user.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
})
export class UserComponent {
  userForm = new FormGroup({
    email: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required]),
  });
  message: any;
  errormessage: any;

  constructor(private service: UserService, private router: Router) {}
  ngOnInit(): void {}
  public LoginNow() {
    let resp = this.service.doLogin(this.userForm.value);
    resp.subscribe((data) => {
      
      this.message = data;
      console.log(this.message);
       
      if (
        this.userForm.value.email == 'admin@gmail.com' &&
        this.userForm.value.password == 'admin'
      ) {
        alert("LoginSuccessfull");
        console.log('loggin succesfully');
        this.router.navigate(['./adminPage']);
      } else if (this.message == 'true') {
        alert("LoginSuccessfull");
        console.log('userpage successfully');
        this.router.navigate(['./userPage']);
      } 
      else {

        alert("login failed");
        console.log('password not matched');
        this.errormessage = 'Credentials not Matched';
      }
    });
  }

  userSubmit() {
    console.log(this.userForm.value);
  }
  get email() {
    return this.userForm.get('email');
  }
  get password() {
    return this.userForm.get('password');
  }
 
}
