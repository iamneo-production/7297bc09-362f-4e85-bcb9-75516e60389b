import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsermyorderComponent } from './usermyorder.component';

describe('UsermyorderComponent', () => {
  let component: UsermyorderComponent;
  let fixture: ComponentFixture<UsermyorderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UsermyorderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UsermyorderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
