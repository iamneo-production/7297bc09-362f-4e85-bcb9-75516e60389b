import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AddgiftsComponent } from './addgifts.component';

describe('AddgiftsComponent', () => {
  let component: AddgiftsComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [AddgiftsComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(AddgiftsComponent);
    component = fixture.componentInstance;
  });
  it('FE_addGiftsTest', () => {
    expect(component).toBeTruthy();
  });
});