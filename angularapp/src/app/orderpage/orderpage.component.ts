import { Component } from '@angular/core';
import { AppService } from 'app.service';

@Component({
  selector: 'app-orderpage',
  templateUrl: './orderpage.component.html',
  styleUrls: ['./orderpage.component.css']
})
export class OrderpageComponent {
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



