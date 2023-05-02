import { Component, OnInit } from '@angular/core';

import { UserdataserviceService } from '../service/userdataservice.service';
import { ActivatedRoute } from '@angular/router';
import { product } from '../product';

@Component({
  selector: 'app-user-page',
  templateUrl: './user-page.component.html',
  styleUrls: ['./user-page.component.css']
})
export class UserPageComponent implements OnInit{
  



  gift:any;

    constructor(private activeRoute:ActivatedRoute,private product:UserdataserviceService){
  
        product.usergift().subscribe((data: any)=>{
  
        console.log("data",data);
  
        this.gift=data;
  
      });

  
}
  ngOnInit(): void {
    throw new Error('Method not implemented.');
    
  }
 
}
