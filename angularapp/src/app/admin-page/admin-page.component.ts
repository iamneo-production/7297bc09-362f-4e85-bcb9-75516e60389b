import { Component } from '@angular/core';
import { UserService } from '../service/user.service';
import { AppService } from 'app.service';

@Component({
  selector: 'app-admin-page',
  templateUrl: './admin-page.component.html',
  styleUrls: ['./admin-page.component.css']
})
export class AdminPageComponent {
  isAdminMenu: boolean=false;

    constructor(
  
          private appService: AppService ) {}
  
     
  
          ngOnInit(){
  
     
  
            const userData = this.appService.getLoggedInUserDetails();
  
     
  
            if(userData.userRole === 'admin') {
  
     
  
              this.isAdminMenu = true;
  
     
  
            }
  
     
  
          }
}