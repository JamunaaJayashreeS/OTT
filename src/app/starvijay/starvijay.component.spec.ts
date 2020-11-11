import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StarvijayComponent } from './starvijay.component';

describe('StarvijayComponent', () => {
  let component: StarvijayComponent;
  let fixture: ComponentFixture<StarvijayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StarvijayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StarvijayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
