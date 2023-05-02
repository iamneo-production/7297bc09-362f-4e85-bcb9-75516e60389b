import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs/internal/BehaviorSubject';

@Injectable({
  providedIn: 'root'
})
export class UserdataserviceService {
  

  constructor(private htt:HttpClient) { }

  url1="http://localhost:8117/user/getGift";

  usergift(){

    return this.htt.get(this.url1);

}

/////////////

public cartItemList:any=[]
public productsList = new BehaviorSubject<any>([]);

  
  getProducts(){
   var test = this.productsList.asObservable();
   console.log(test);
   return test;
  }
  setProduct(product : any){
    this.cartItemList.push(...product);
    this.productsList.next(product);
  }
  addtoCart(product : any){
    this.cartItemList.push(product);
    this.productsList.next(this.cartItemList);
    this.getTotalPrice();
    console.log(this.cartItemList)
  }
  getTotalPrice():number{
    let grandTotal = 0;
    this.cartItemList.map((a:any)=>{
      grandTotal += a.total;
    })
    return grandTotal;
  }
  removeCartItem(product:any)
  {
    this.cartItemList.map((a:any,index:any)=>{
      if(product.id===a.id){      //checks the product id to remove the product
        this.cartItemList.splice(index,1);
      }
    })
    this.productsList.next(this.cartItemList);
  }removeallcart(){
    this.cartItemList = []
    this.productsList.next(this.cartItemList);
  }


    them(){
  
       return this.htt.get("http://localhost:8117/user/getAllThemes");
  
  }
  
// url2="http://localhost:8117/admin/addTheme";

// addtheme(data:any){

//   return this.htt.post(this.url2,data);

// }
addorder(data:any){
  return this.htt.post("http://localhost:8117/user/addOrder",data)

}


}
