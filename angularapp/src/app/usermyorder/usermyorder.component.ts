import { Component } from '@angular/core';
import { AppService } from 'app.service';

@Component({
  selector: 'app-usermyorder',
  templateUrl: './usermyorder.component.html',
  styleUrls: ['./usermyorder.component.css']
})
export class UsermyorderComponent {
  order:any
    constructor(private appservice:AppService){

        appservice.order().subscribe((data: any)=>{
  
        console.log("data",data);
  
        this.order=data;
  
      });
}
  deleteorder(data:any){

      this.appservice.deleteorder(data).subscribe((result)=>{
    
        console.warn(result)
    
    
    
    
      })
  }
    
}
