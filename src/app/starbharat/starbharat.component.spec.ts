import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StarbharatComponent } from './starbharat.component';

describe('StarbharatComponent', () => {
  let component: StarbharatComponent;
  let fixture: ComponentFixture<StarbharatComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StarbharatComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StarbharatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
