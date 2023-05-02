import { Component } from '@angular/core';
import { AppService } from 'app.service';

@Component({
  selector: 'app-themepage',
  templateUrl: './themepage.component.html',
  styleUrls: ['./themepage.component.css']
})

export class ThemepageComponent {

  theme:any;

  themeId:any;

  themeName:any;

  themePrice:any;

  themeDetails:any;

  currentId:any;









  alltheme: any;

  constructor(private appservice:AppService){

      appservice.them().subscribe((data: any)=>{

      console.log("data",data);

      this.theme=data;

    });

  }

addtheme(data:any)

{

  console.warn(data);

  this.appservice.addtheme(data).subscribe((result)=>{

    console.warn(result)

  })

}

deletetheme(data:any){

  this.appservice.deletetheme(data).subscribe((result)=>{

    console.warn(result)




  })

}

edit(theme:any){

  this.themeId=theme.themeId;

  this.themeName=theme.themeName;

  this.themePrice=theme.themePrice;

  this.themeDetails=theme.themeDetails;

  this.currentId=theme.currentId

 




}

update(){

  let updatetheme={

    "id":this.themeId,

    "name":this.themeName,

    "price":this.themePrice,

    "Details":this.themeDetails,

  }

  this.appservice.updatetheme(this.currentId,updatetheme).subscribe((res)=>{

   console.warn(res)

  })




}

 

}





