import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ThemepageComponent } from './themepage.component';

describe('ThemepageComponent', () => {
  let component: ThemepageComponent;
  let fixture: ComponentFixture<ThemepageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ThemepageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ThemepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
