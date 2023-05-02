import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AppService } from 'app.service';

@Component({
  selector: 'app-editgift',
  templateUrl: './editgift.component.html',
  styleUrls: ['./editgift.component.css']
})
export class EditgiftComponent  implements OnInit {
  policyForm!:FormGroup;
  giftId: any;
  giftName: any;
  giftDetails: any;
  giftPrice: any;
  constructor(
  private formBuilder: FormBuilder,
  public addpolicy: AppService
   ) { }

   ngOnInit(){
    this.policyForm = this.formBuilder.group({
      giftId:[''],
      giftName: ['', Validators.required],
      giftDetails: ['', Validators.required],
      giftPrice: ['', Validators.required],

       });
}
onSubmit(): void {
  if (this.policyForm.valid) {
  this.addpolicy.addgift(this.policyForm.value).subscribe(res => {
  console.log(res);
     });
    this.policyForm.reset();
    }
    else {
    alert('Form should not be null'); }
      }
      edit(): void {
        if (this.policyForm.valid) {
        this.addpolicy.addgift(this.policyForm.value).subscribe(res => {
        console.log(res);
           });
          this.policyForm.reset();
          }
          else {
          alert('Form should not be null'); }
            }


}
