import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelectthemeComponent } from './selecttheme.component';

describe('SelectthemeComponent', () => {
  let component: SelectthemeComponent;
  let fixture: ComponentFixture<SelectthemeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelectthemeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SelectthemeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
