import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { UserPageComponent } from './user-page/user-page.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { ThemepageComponent } from './themepage/themepage.component';
import { GiftpageComponent } from './giftpage/giftpage.component';
import { OrderpageComponent } from './orderpage/orderpage.component';
import { EditgiftComponent } from './editgift/editgift.component';
import { CartComponent } from './cart/cart.component';
import { SelectthemeComponent } from './selecttheme/selecttheme.component';
import { UserorderComponent } from './userorder/userorder.component';
import { UsermyorderComponent } from './usermyorder/usermyorder.component';

// import { GiftComponent } from './giftpage/giftpage.component';

const routes: Routes = [
  {
    path:'',redirectTo:'login',pathMatch:'full'
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'user',
    component: UserComponent,
  },
  {
    path:"userPage",
    component:UserPageComponent
  },
  {
    path:"adminPage",
    component:AdminPageComponent
  }
  ,{
    path:'themepage', 
    component:ThemepageComponent
  },
   {
     path:"giftpage",
     component:GiftpageComponent
   },
   {
    path:"edit",
    component:EditgiftComponent
   },
   {
    path:"orderpage",
    component:OrderpageComponent
   },
   {
    path:"edit/:giftId",
    component:EditgiftComponent
   },
   {
    path:"cart",
    component:CartComponent
   },
   {
    path:"selecttheme",
    component:SelectthemeComponent
   },
   {
    path:"userorder/:giftId",
    component:UserorderComponent
   },
   {
    path:"logout",
    component:UserComponent
   },
   {
    path:"myorder",
    component:UsermyorderComponent
   }

   
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
