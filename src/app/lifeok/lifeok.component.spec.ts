import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LifeokComponent } from './lifeok.component';

describe('LifeokComponent', () => {
  let component: LifeokComponent;
  let fixture: ComponentFixture<LifeokComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LifeokComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LifeokComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
