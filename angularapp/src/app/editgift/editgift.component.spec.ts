import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditgiftComponent } from './editgift.component';

describe('EditgiftComponent', () => {
  let component: EditgiftComponent;
  let fixture: ComponentFixture<EditgiftComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditgiftComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditgiftComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
