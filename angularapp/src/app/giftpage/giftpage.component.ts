import { Component } from '@angular/core';
import { AppService } from 'app.service';

@Component({
  selector: 'app-giftpage',
  templateUrl: './giftpage.component.html',
  styleUrls: ['./giftpage.component.css']
})
export class GiftpageComponent {

  

  gift:any;

  giftId:any;

  giftName:any;

  giftPrice:any;

  giftDetails:any;

  currentId:any;


  allgift: any;

  constructor(private appservice:AppService){

      appservice.gift().subscribe((data: any)=>{

      console.log("data",data);

      this.gift=data;

    });


  }

addgift(data:any)

{

  console.warn(data);

  this.appservice.addgift(data).subscribe((result)=>{

    console.warn(result)

  })

}

deletegift(data:any){

  this.appservice.deletegift(data).subscribe((result)=>{

    console.warn(result)


  })

}

editgift(gift:any){

  this.giftId=gift.giftId;

  this.giftName=gift.giftName;

  this.giftPrice=gift.giftPrice;

  this.giftDetails=gift.giftDetails;

  this.currentId=gift.currentId


}

updategift(){

  let updategift={

    "id":this.giftId,

    "name":this.giftName,

    "price":this.giftPrice,

    "Details":this.giftDetails,

  }

  this.appservice.updategift(this.currentId,updategift).subscribe((res)=>{

   console.warn(res)

  })


}
}
