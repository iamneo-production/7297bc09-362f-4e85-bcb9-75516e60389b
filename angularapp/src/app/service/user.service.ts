import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  usergift() {
    throw new Error('Method not implemented.');
  }
  getLoggedInUserDetails() {
    throw new Error('Method not implemented.');
  }
  Create(value: any) {
    throw new Error('Method not implemented.');
  }

  constructor(private htt:HttpClient) { }
  // regs
public doRegestration(user: any){
  return this.htt.post("http://localhost:8117/user/signup",user,{responseType:'text' as 'json'});
}
// admin
public doLogin(user: any){
  return this.htt.post("http://localhost:8117/user/login",user,{responseType:'text' as 'json'});
}


}
