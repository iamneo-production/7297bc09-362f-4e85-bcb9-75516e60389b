import { Component } from '@angular/core';
import { UserdataserviceService } from '../service/userdataservice.service';
//import { AppService } from 'app.service';


@Component({
  selector: 'app-userorder',
  templateUrl: './userorder.component.html',
  styleUrls: ['./userorder.component.css']
})
export class UserorderComponent {

alltheme: any;
theme:any;

    constructor(private service:UserdataserviceService){
  
        service.them().subscribe((data: any)=>{
  
        console.log("data",data);
  
        this.theme=data;
  
      });
  
    }



adduserorder(data:any){
  console.warn(data);

   this.service.addorder(data).subscribe((result)=>{

    console.warn(result)

   })

}
add(){
  alert("order succesfully");
}
}














