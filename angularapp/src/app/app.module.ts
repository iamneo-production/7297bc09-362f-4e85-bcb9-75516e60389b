import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserPageComponent } from './user-page/user-page.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
// import { GiftpageComponent } from './giftpage/giftpage.component';
import { ThemepageComponent } from './themepage/themepage.component';
import { OrderpageComponent } from './orderpage/orderpage.component';

import { GiftpageComponent } from './giftpage/giftpage.component';
import { EditgiftComponent } from './editgift/editgift.component';
import { UserpageComponent } from './userpage/userpage.component';
import { CartComponent } from './cart/cart.component';
import { SelectthemeComponent } from './selecttheme/selecttheme.component';
import { UserorderComponent } from './userorder/userorder.component';
import { UsermyorderComponent } from './usermyorder/usermyorder.component';


@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    LoginComponent,
    UserPageComponent,
    AdminPageComponent,
    GiftpageComponent,
    ThemepageComponent,
    OrderpageComponent,
    EditgiftComponent,
    UserpageComponent,
    CartComponent,
    SelectthemeComponent,
    UserorderComponent,
    UsermyorderComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
     ],
  providers: [UserComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
