import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StarworldComponent } from './starworld.component';

describe('StarworldComponent', () => {
  let component: StarworldComponent;
  let fixture: ComponentFixture<StarworldComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StarworldComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StarworldComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
